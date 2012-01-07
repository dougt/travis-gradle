(ns gradle-travis.test
  (:use midje.sweet, gradle-travis.core))

(fact (testfn2 "world") => "Hello world")
