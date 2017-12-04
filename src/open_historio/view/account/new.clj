(ns open-historio.view.account.new
  (:require [hiccup.core :as hiccup]
            [hiccup.form :refer [form-to label text-field email-field password-field submit-button]]
            [ring.util.anti-forgery :refer [anti-forgery-field]]))

(defn html []
  (hiccup/html
   (form-to [:post "/accounts"]
            [:div
             (label "username" "username")
             (text-field {:placeholder "username"} "username")]
            [:div
             (label "email" "email")
             (email-field {:placeholder "foo@example.com"} "email")]
            [:div
             (label "password" "password")
             (password-field "password")]
            (anti-forgery-field)
            [:div (submit-button "create")])))
