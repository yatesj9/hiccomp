# Hiccomp

Compojure Hiccup template, very simple with basic code example using bootstrap.

# About

Requires Leiningen 2.0+

# Installation

Download and run "lein new"

```clojure
lein new hiccomp <project name>
```

# Usage

```clojure
(require '[new-comp.repl :refer [start-server stop-server])

;Port of your choosing
(start-server 3001)
 
(stop-server)
```