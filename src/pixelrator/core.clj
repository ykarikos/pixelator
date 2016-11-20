(ns pixelrator.core
  (require [pixelrator.transformer :as t]
           [pixelrator.parser :as p])
  (:gen-class))

(defn -main
  [& args]
  (let [file (p/parse (first args))
        row (t/transform-row (first (file :pixels)) (file :colormap))]
    (println row)))
