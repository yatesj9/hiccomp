(ns {{ns-name}}.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.format :refer [wrap-restful-format]]
            [{{ns-name}}.views.index :refer [index]]
            [{{ns-name}}.views.about :refer [about]]))

(defroutes app-routes
  (GET "/" [] index)
  (GET "/about" [] about)
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (routes app-routes)
      (wrap-defaults (assoc site-defaults :security {:anti-forgery false}))
      (wrap-restful-format :format [:json-kw])))
