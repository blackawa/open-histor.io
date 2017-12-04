(ns open-historio.boundary.account
  (:require [buddy.hashers :as hs]
            [clojure.java.jdbc :as jdbc]
            [duct.database.sql]))

(defprotocol Accounts
  (create [db account]))

(extend-protocol Accounts
  duct.database.sql.Boundary
  (create [{db :spec} account]
    (ffirst (jdbc/insert!
             db
             :accounts
             (update account :password #(hs/encrypt %))))))
