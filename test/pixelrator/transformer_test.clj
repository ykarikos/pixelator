(ns pixelrator.transformer-test
  (:require [clojure.test :refer :all]
            [pixelrator.transformer :refer :all]))

(deftest test-transform-row
  (testing "transform a row"
    (is (=
      "<rect x=\"3\" y=\"1\" fill=\"#C1C1C1\" width=\"1\" height=\"1\"/>\n"
      (transform-row " b a" {\a "C1C1C1"})))))
