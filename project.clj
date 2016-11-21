(defproject pixelrator "0.1.0-SNAPSHOT"
  :description "Create pixelated svg image out of a text file"
  :license {:name "MIT"
            :url "https://github.com/ykarikos/pixelator/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot pixelrator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
