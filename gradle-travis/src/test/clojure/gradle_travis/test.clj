(ns gradle-travis.test
  (:use midje.sweet, clojure.test, gradle-travis.core))

(deftest t1
  (fact (identity 3) => nil)
  (fact (testfn2 "world") => "Hello world"))
