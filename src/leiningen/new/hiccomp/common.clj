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
       [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
       [:div {:class "container-fluid"}
        header
        content]
       (include-css "//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css")
       (include-css "/css/custom.css")
       (include-js "//code.jquery.com/jquery-1.11.2.min.js")
       (include-js "//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js")))
