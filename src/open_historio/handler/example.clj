(ns open-historio.handler.example
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response] 
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :open-historio.handler/example [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (io/resource "open_historio/handler/example/example.html")]))
