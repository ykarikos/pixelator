(ns pixelator.parser
  (require [clojure.string :as str]))

(defn- parse-colormap
  [init colordata]
  (let [split-data (str/split colordata #" ")]
    (merge init {(-> split-data first first) (second split-data)})))

(defn parse
  [filename]
  (let [lines (str/split-lines (slurp filename))
        colorcount (Integer. (first lines))
        colordata (take colorcount (rest lines))
        pixeldata (drop colorcount (rest lines))
        indices (range (count pixeldata))
        indexed-pixeldata (zipmap indices pixeldata)]
    {:colormap (reduce parse-colormap {} colordata)
     :pixels indexed-pixeldata}))
