(ns {{ns-name}}.views.common
  (:use [hiccup core page]))

(def header
     [:nav {:class "navbar navbar-default navbar-fixed-top navbar-inverse"}
      [:div {:class "navbar-header"}
       [:button {:type "button" :class "navbar-toggle" :data-toggle "collapse"
                  :data-target "#bs-example-navbar-collapse-1"}
         [:span {:class "sr-only"} "Toggle navigation"]]
       [:a {:class "navbar-brand"
            :href "/"} "Compojure"]
       [:ul {:class "nav navbar-nav"}
        [:li [:a {:href "/"} "Home"]]
        [:li [:a {:href "/about"} " About"]]]]])

(defn main
  [& content]
     (html5
       (include-css "//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")
       (include-css "/css/custom.css")
       [:title "Compojure"]
       [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
       [:meta {:charset "utf-8"}]
       [:meta {:name "description" :content ""}]
       [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
       [:div {:class "container"}
        header
        content]
       (include-js "//code.jquery.com/jquery-1.11.3.min.js")
       (include-js "//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js")))
