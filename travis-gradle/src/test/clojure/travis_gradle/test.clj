(ns travis-gradle.test
  (:use midje.sweet, clojure.test, travis-gradle.core))

(deftest t1
  (fact (testfn "world") => "Hello world"))
