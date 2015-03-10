(ns {{ns-name}}.views.index
  (:require [{{ns-name}}.views.common :refer [main]])
  (:use [hiccup core page]))

(def index
     (main
       [:h2 "Welcome to the Index"]
       [:div "Enjoy your stay"]))
