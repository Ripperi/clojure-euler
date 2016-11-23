(ns euler.euler-005)

(defn divisible-with-all? [n]
  (every? #(= 0 (mod n %)) (range 11 21)))

(defn find-smallest [n]
  (if (divisible-with-all? n)
    n
    (recur (+ n 20))))

(find-smallest 20)
