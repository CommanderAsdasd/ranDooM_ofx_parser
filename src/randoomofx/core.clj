(ns randoomofx.core
(:require [cheshire.core :refer :all]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn main
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn load-json-template
  []
  (parse-string
    (slurp "./resources/test.json")
  )
)