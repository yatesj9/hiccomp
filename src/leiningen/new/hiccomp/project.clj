(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :description "Hiccomp template"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring-server "0.5.0"]
                 [ring-middleware-format "0.7.4"]
                 [hiccup "2.0.0-alpha2"]
                 [midje "1.9.9"]]
  :plugins [[lein-ring "0.12.4"]
            [lein-midje "3.2.1"]]
  :ring {:handler {{ns-name}}.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.4.0"]]}})
