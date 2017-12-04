(ns open-historio.handler.account
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response]
            [duct.database.sql]
            [integrant.core :as ig]
            [open-historio.boundary.account :refer [create]]
            [open-historio.view.account.new :as new]))

(defmethod ig/init-key ::new [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (new/html)]))

(defmethod ig/init-key ::create [_ {:keys [db]}]
  (fn [{[_ account] :ataraxy/result}]
    (create db (select-keys account [:name :email :password]))
    [::response/see-other "/subjects"]))
