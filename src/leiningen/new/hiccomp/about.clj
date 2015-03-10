(ns {{ns-name}}.views.about
  (:require [{{ns-name}}.views.common :refer [main]])
  (:use [hiccup core]))

(def about
     (main
       [:h2 "About"]
       [:div "Welcome to the About page for this Hiccup Clojure app"]))
