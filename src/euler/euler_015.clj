(ns euler.euler-015)

(defn factorial
  [n]
  (reduce *' (range 1 (inc n))))

(defn binomial-coefficient
  [n k]
  (/ (factorial n)
     (*' (factorial k) (factorial (- n k)))))

(defn routes
  [grid-size]
  (time (let [n (* 2 grid-size)
              k grid-size]
          (binomial-coefficient n k))))

(defn main
  []
  (routes 20))
