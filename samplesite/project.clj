(defproject samplesite "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371" :scope "provided"]
                 [om "0.7.3"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :min-lein-version "2.5.0"

  :cljsbuild {:builds {:app {:id "dumb1"
                             :source-paths ["src/cljs/samplesite"]
                             :compiler {:optimizations :simple
                                        :preamble ["react/react.min.js"]
                                        :externs ["react/externs/react.js"]
                                        :output-to "dist/js/dumb1.js"}}}})
