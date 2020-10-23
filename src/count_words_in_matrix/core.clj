(ns count-words-in-matrix.core
  (:gen-class)
  (:use clojure.test))

(def m [[\A \O \T \D \L \R \O \W]
        [\H \C \B \U \Z \Z \L \U]
        [\E \R \U \J \D \B \L \J]
        [\L \A \Z \H \Z \Z \E \F]
        [\L \C \Z \E \L \F \H \W]
        [\O \K \U \L \V \P \P \G]])

(defn transpose [m] (apply map vector m))

;; Convert grid to list of strings, including forward, backward, down & up lines.
(defn matrix2lines [m]
  (let [m' (transpose m)]
    (concat
      (map #(apply str %) m)
      (map #(apply str (reverse %)) m)
      (map #(apply str %) m')
      (map #(apply str (reverse %)) m'))))

(defn count-in-line [word line]
 (count (re-seq (re-pattern word) line)))

(defn count-words-in-matrix [m word]
  (reduce + (map #(count-in-line word %) (matrix2lines m))))

(def tests {
  "HELLO"     2
  "WORLD"     1
  "BUZZ"      2
  "CRACK"     1
  "CLOJURE"   0
  "COWABUNGA" 0})

(defn -main
  "Runs test cases for word count."
  [& args]
  (when 
    (every? #(is (= (count-words-in-matrix m (first %)) (second %))) tests)
    (println "All tests passed!")))

