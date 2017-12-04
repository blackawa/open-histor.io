(ns open-historio.boundary.account
  (:require [clojure.java.jdbc :as jdbc]
            [duct.database.sql]))

(defprotocol Accounts
  (create [db user]))

(extend-protocol Accounts
  duct.database.sql.Boundary
  (create [db account]
    (val (ffirst (jdbc/insert! db :accounts account)))))
