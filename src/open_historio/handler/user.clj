(ns open-historio.handler.user
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response]
            [integrant.core :as ig]
            [open-historio.boundary.user :as user]
            [open-historio.view.user.new :as new]))

(defmethod ig/init-key ::new [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (new/html)]))

(defmethod ig/init-key ::create [_ {:keys [db]}]
  (fn [{[_ user] :ataraxy/result}]
    (println db)
    (println user)
    [::response/see-other "/subjects"]))
