(ns pixelrator.core
  (require [pixelrator.transformer :as t])
  (:gen-class))

(def colormap
  {\a "343F35", \g "329E41"})

(defn -main
  [& args]
  (println (t/transform-row (first args) colormap)))
