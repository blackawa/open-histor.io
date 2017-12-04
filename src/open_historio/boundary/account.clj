(ns open-historio.boundary.account
  (:require [buddy.hashers :as hs]
            [clojure.java.jdbc :as jdbc]
            [duct.database.sql]))

(defprotocol Accounts
  (create [db account])
  (find-by-email [db email]))

(extend-protocol Accounts
  duct.database.sql.Boundary
  (create [{db :spec} account]
    (val
     (ffirst
      (jdbc/insert!
       db
       :accounts
       (update account :password #(hs/encrypt %))))))
  (find-by-email [{db :spec} email]
    (first (jdbc/query db ["select * from accounts where email = ?" email]))))
