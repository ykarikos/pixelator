(ns pixelrator.transformer)

(defn- to-svg
  [x y color]
  (if color
    (str "<rect x=\"" x
      "\" y=\"" y
      "\" fill=\"#" color
      "\" width=\"1\" height=\"1\"/>\n")
    ""))

(defn- transform-pixel
  [y colormap init x color]
  (let [pixel (to-svg x y (colormap color))]
    (str init pixel)))

(defn transform-row
  [row colormap]
  (let [indices (range (count row))
        rowzip (zipmap indices row)]
    (reduce-kv (partial transform-pixel 1 colormap) "" rowzip)))
