(ns pixelator.parser-test
  (:require [clojure.test :refer :all]
            [pixelator.parser :refer :all]))

(deftest test-parser
  (testing "parse a file"
    (is (=
      {:colormap {\g "00C000"
                  \b "0000C0"
                  \r "C00000"
                  \d "C1C1C1"}
       :pixels {0 "g b"
               1 " rrdd"}}
      (parse "test/pixelator/colortest.txt")))))
