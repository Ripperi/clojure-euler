(ns euler.euler-016)

(defn sum-of-digits
  [n]
  (->> n
       (str)
       (seq)
       (reduce (fn [l r] (+ l (read-string (str r)))) 0)))

(defn helper
  [n pow]
  (sum-of-digits (reduce *' (take 1000 (repeat 2)))))

(defn main
  []
  (helper 2 1000))
