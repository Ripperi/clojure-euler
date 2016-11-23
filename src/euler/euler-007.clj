(ns euler.euler-007)

(defn prime? [n]
  (cond
    (<= n 1) false
    (<= n 3) true
    :else (every? #(not= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n)))))))

(nth (filter prime? (range)) 10000)
