(ns pixelrator.core
  (require [pixelrator.transformer :as t]
           [pixelrator.parser :as p])
  (:gen-class))

(defn- svg-prologue
  [width height]
  (str
    "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"
    	 viewBox=\"0 0 " width " " height "\">
    <g>"))

(def svg-epilogue
  "</g>\n</svg>")

(defn -main
  [& args]
  (let [file (p/parse (first args))
        pixels (file :pixels)
        output (t/transform pixels (file :colormap))
        height (count pixels)
        width (->> pixels
                   vals
                   (map count)
                   (apply max))]
    (println (svg-prologue width height))
    (print output)
    (println svg-epilogue)))
