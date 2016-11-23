(ns euler.euler-003)

(defn prime? [n]
  (cond
    (<= n 1) false
    (<= n 3) true
    :else (every? #(not= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n)))))))

(defn divisible? [m n]
  (= 0 (mod m n)))

(defn solve-for [n]
  (->> (Math/sqrt n)
       int
       inc
       (range 1)
       (filter prime?)
       (filter #(divisible? n %))
       last))

(solve-for 600851475143)

;; (last (filter divisible? (filter prime? (range 1 (inc (int (Math/sqrt 600851475143)))))))
