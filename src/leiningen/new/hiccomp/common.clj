(ns {{ns-name}}.views.common
  (:use [hiccup core page]))

(def header
  [:nav {:class "navbar navbar-expand-lg navbar-dark fixed-top bg-dark"}
   [:a {:class "navbar-brand" :href "#"}"iTwo"]
   [:button {:class "navbar-toggler" :type "button" :data-toggle "collapse" :data-target "#navbarNav" :aria-expanded "false"
             :aria-label "Toggle navigation"}
    [:span {:class "navbar-toggler-icon"}]]
   [:div {:class "collapse navbar-collapse" :id "navbarNav"}
    [:ul {:class "navbar-nav"}
     [:li {:class "nav-item active"}
      [:a {:class "nav-link" :href "/"} "Home"]]
     [:li {:class "nav-item"}
      [:a {:class "nav-link" :href "/about"} "About"]]]]])


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
       (include-js "//code.jquery.com/jquery-3.4.1.min.js")
       (include-js "//maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js")))
