(defproject cljs-test-example "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.7.0-beta3"]
                           [org.clojure/clojurescript "0.0-3269"]]
            :plugins [[lein-cljsbuild "1.0.6"]
                      [lein-figwheel "0.3.3"]]
            :cljsbuild {:builds {:main {:source-paths ["src" "test"]
                                        :figwheel {:on-jsload "cljs-test-example.test/run"}
                                        :compiler {:output-to "resources/public/compiled/main.js"
                                                   :output-dir "resources/public/compiled"
                                                   :asset-path "/compiled"
                                                   :main "cljs-test-example.core"
                                                   :source-map true
                                                   :optimizations :none
                                                   :pretty-print false}}
                                 :test {:source-paths ["src" "test"]
                                        :compiler {:output-to "resources/test/compiled.js"
                                                   :optimizations :whitespace
                                                   :pretty-print true}}}
                        :test-commands {"test" ["phantomjs"
                                                "resources/test/test.js"
                                                "resources/test/test.html"]}}
            :figwheel {:nrepl-port 7888})
