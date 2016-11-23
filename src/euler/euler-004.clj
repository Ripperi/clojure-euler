(ns euler.euler-004)

(defn palindrome? [n]
  (let [s (seq (str n))
        r (reverse s)]
    (= s r)))

(defn product-list [a b]
  (for [x (range a b)
       y (range a b)]
   (* x y)))

(apply max (filter palindrome? (product-list 100 1000)))
