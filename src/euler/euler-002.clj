(ns euler.euler-002)

(defn fib [[i j]]
  [(+ i j) i])

(defn less-than? [x]
  (< x 4000000))

(reduce + (take-while less-than? (filter even? (map second (iterate fib [2 1])))))
