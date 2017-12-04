(ns open-historio.view.account.new
  (:require [hiccup.core :as hiccup]
            [hiccup.form :refer [form-to label text-field email-field password-field submit-button]]
            [ring.util.anti-forgery :refer [anti-forgery-field]]))

(defn html []
  (hiccup/html
   (form-to [:post "/users"]
            [:div
             (label "username" "username")
             (text-field {:placeholder "username"} "username")]
            (anti-forgery-field)
            [:div (submit-button "create")])))
