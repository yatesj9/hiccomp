# Hiccomp

Compojure Hiccup template, very simple with basic code example using bootstrap. Includes Midje for testing.

# About

Requires Leiningen 2.0+

# Installation

Download and run "lein new"

```clojure
lein new hiccomp <project name>
```

# Usage

```clojure
;Require repl namespace
(require '[<project name>.repl :refer [start-server stop-server])

;Start webserver with specified environment config - check config.clj default port 5566
(start-server :development)

;Stop webserver
(stop-server)
```