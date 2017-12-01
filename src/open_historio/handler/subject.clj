(ns open-historio.handler.subject
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response]
            [integrant.core :as ig]
            [open-historio.view.subject.index :as index]))

(defmethod ig/init-key ::index [_ {db :db}]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (index/html)]))
