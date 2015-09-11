(ns {{ns-name}}.repl
  (:require [{{ns-name}}.handler :refer [app]]
            [{{ns-name}}.config :refer [set-mode!
                                             get-settings]])
  (:use [ring.server.standalone]))

(defonce server (atom nil))

(defn get-handler
  []
  (-> #'app))

(defn start-server
  [mode]
  (reset! server
    (do
      (set-mode! mode)
     (serve (get-handler) {:port (get-settings :server :port)
                           :open-browser? false}))))

(defn stop-server
  []
  (.stop @server))
