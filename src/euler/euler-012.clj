(ns euler.euler-012)

(defn triangular
  [n]
  (/ (* n (inc n)) 2))

(defn num-of-divisors
  [n]
  (* 2 (count (filter #(zero? (mod n %))
                      (range 1 (inc (int (Math/sqrt n))))))))

(defn main
  [n]
  (first (drop-while
           #(<= (num-of-divisors %) n)
           (map triangular (iterate inc 1)))))
