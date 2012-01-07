(ns travis-gradle.test
  (:use midje.sweet, travis-gradle.core))

(fact (testfn "world") => "Hello world")
