(ns {{ns-name}}.views.common
  (:use [hiccup core page]))

(def header
     [:nav {:class "navbar navbar-default navbar-fixed-top navbar-inverse"}
      [:div {:class "container"}
       [:a {:class "navbar-brand"
            :href "/"} "Compojure"]
       [:ul {:class "nav navbar-nav"}
        [:li [:a {:href "/"} "Home"]]
        [:li [:a {:href "/about"} " About"]]]]])

(defn main
  [& content]
     (html
       [:title "Compojure"]
       [:div {:class "container-fluid"}
        header
        content]
       (include-css "/css/bootstrap.css")
       (include-css "/css/custom.css")
       (include-js "/js/bootstrap.js")))
