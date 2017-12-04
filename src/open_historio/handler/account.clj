(ns open-historio.handler.account
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response]
            [integrant.core :as ig]
            [open-historio.boundary.account :as account]
            [open-historio.view.account.new :as new]))

(defmethod ig/init-key ::new [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (new/html)]))

(defmethod ig/init-key ::create [_ {:keys [db]}]
  (fn [{[_ account] :ataraxy/result}]
    (println db)
    (println account)
    [::response/see-other "/subjects"]))
