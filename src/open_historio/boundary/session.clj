(ns open-historio.boundary.session
  (:require [buddy.hashers :as hs]
            [clj-time.core :as time]
            [clj-time.jdbc]
            [clojure.java.jdbc :as jdbc]
            [duct.database.sql]
            [open-historio.boundary.account :as account]))

(defprotocol Sessions
  (sign-in [db email password]))

(extend-protocol Sessions
  duct.database.sql.Boundary
  (sign-in [{spec :spec :as db} email password]
    (if (hs/check password (:password (account/find-by-email db email)))
      (ffirst (jdbc/insert! spec
                            :sessions
                            {:id (.toString (java.util.UUID/randomUUID))
                             :content (pr-str {})
                             :expire_at (time/plus (time/now) (time/days 30))})))))
