(ns pixelrator.transformer)

(defn- to-svg
  [x y color]
  (if color
    (str "<rect x=\"" x
      "\" y=\"" y
      "\" fill=\"#" color
      "\" width=\"1.01\" height=\"1.01\"/>\n")
    ""))

(defn- transform-pixel
  [y colormap init x color]
  (let [pixel (to-svg x y (colormap color))]
    (str init pixel)))

(defn- transform-row
  [colormap init rownum row]
  (let [indices (range (count row))
        rowzip (zipmap indices row)]
    (reduce-kv (partial transform-pixel rownum colormap) init rowzip)))

(defn transform
  [pixeldata colormap]
  (reduce-kv (partial transform-row colormap) "" pixeldata))
