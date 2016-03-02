(ns leiningen.new.hiccomp
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "hiccomp"))

(defn hiccomp
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/handler.clj" (render "handler.clj" data)]
["src/{{sanitized}}/views/about.clj" (render "about.clj" data)]
["src/{{sanitized}}/views/index.clj" (render "index.clj" data)]
["src/{{sanitized}}/config.clj" (render "config.clj" data)]
["src/{{sanitized}}/views/common.clj" (render "common.clj" data)]
["project.clj" (render "project.clj" data)]
["test/{{sanitized}}/handler_test.clj" (render "handler_test.clj" data)]
["src/{{sanitized}}/repl.clj" (render "repl.clj" data)]
["resources/public/css/custom.css" (render "custom.css")]
)))