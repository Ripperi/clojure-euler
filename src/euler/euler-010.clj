(ns euler.euler-010)

(defn prime? [n]
  (cond
    (<= n 1) false
    (<= n 3) true
    :else (every? #(not= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n)))))))

(reduce + (take-while #(< % 2000000) (filter prime? (range))))
