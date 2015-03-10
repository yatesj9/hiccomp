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
["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/views/common.clj" (render "common.clj" data)]
["src/{{sanitized}}/repl.clj" (render "repl.clj" data)]
["test/{{sanitized}}/handler_test.clj" (render "handler_test.clj" data)]
["resources/public/.DS_Store" (render ".DS_Store")]
["resources/public/css/bootstrap.css.map" (render "bootstrap.css.map")]
["resources/public/js/bootstrap.js" (render "bootstrap.js")]
["resources/public/css/custom.css" (render "custom.css")]
["resources/.DS_Store" (render ".DS_Store")]
["resources/public/css/bootstrap.css" (render "bootstrap.css")]
)))