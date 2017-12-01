(ns open-historio.handler.user
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response]
            [integrant.core :as ig]
            [open-historio.view.user.new :as new]))

(defmethod ig/init-key ::new [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (new/html)]))

(defmethod ig/init-key ::create [_ {db :db}]
  (println db)
  (fn [{[_ user] :ataraxy/result}]
    (println user)
    [::response/see-other "/subjects"]))
