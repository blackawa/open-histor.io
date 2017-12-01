(ns open-historio.handler.top
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response]
            [integrant.core :as ig]
            [hiccup.core :refer [html]]))

(defmethod ig/init-key :open-historio.handler/top [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (html [:h1 "hello from open-histor.io"])]))
