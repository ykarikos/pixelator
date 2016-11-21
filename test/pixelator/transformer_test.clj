(ns pixelator.transformer-test
  (:require [clojure.test :refer :all]))

(deftest test-transform-row
  (testing "transform a row"
    (is (=
      "<rect x=\"3\" y=\"1\" fill=\"#C1C1C1\" width=\"1.01\" height=\"1.01\"/>\n"
      (#'pixelator.transformer/transform-row {\a "C1C1C1"} "" 1 " b a" )))))
