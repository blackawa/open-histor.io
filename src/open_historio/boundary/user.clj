(ns open-historio.boundary.user
  (:require [clojure.java.jdbc :as jdbc]
            [duct.database.sql]))

(defprotocol Users
  (create [db user]))

(extend-protocol Users
  duct.database.sql.Boundary
  (create [db user]
    (val (ffirst (jdbc/insert! db :users user)))))
