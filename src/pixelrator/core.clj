(ns pixelrator.core
  (require [pixelrator.transformer :as t]
           [pixelrator.parser :as p])
  (:gen-class))

(defn -main
  [& args]
  (let [file (p/parse (first args))
        output (t/transform (file :pixels) (file :colormap))]
    (println output)))
