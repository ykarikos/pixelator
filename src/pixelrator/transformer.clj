(ns pixelrator.transformer)

(defn- get-color
  [c]
  "#C1C1C1")

(defn- to-svg
  [y color x]
  (str "<rect x=\"" x
    "\" y=\"" y
    "\" fill=\""
    (get-color color)
    "\" width=\"1\" height=\"1\"/>\n"))

(defn- transform-pixel
  [y init x color]
  (let [pixel (to-svg y color x)]
    (str init pixel)))

(defn transform-row
  [row]
  (let [indices (range (count row))
        rowzip (zipmap indices row)]
    (reduce-kv (partial transform-pixel 1) "" rowzip)))
