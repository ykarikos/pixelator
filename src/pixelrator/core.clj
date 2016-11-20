(ns pixelrator.core
  (require [pixelrator.transformer :as t])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (t/transform-row (first args))))
