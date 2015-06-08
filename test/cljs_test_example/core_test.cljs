(ns ^:figwheel-load cljs-test-example.core-test
  (:require [cljs.test :refer-macros [deftest is]]
            [cljs-test-example.core :refer [do-something-x-y]]))

(deftest test-do-something-x-y
  (is (= (do-something-x-y 1 2) 3)))
