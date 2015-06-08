(ns ^:figwheel-always cljs-test-example.test
  (:require [cljs.test :refer-macros [run-all-tests]]))

(enable-console-print!)

(defn ^:export run
  []
  (run-all-tests #"cljs-test-example.*-test"))
