(ns euler.euler-009)

(defn solved [b]
  (let [a (/ (* 1000 (- b 500)) (- b 1000))
        c (- 1000 a b)]
    (if (= 0 (mod a 1))
      [(= (+ a b c) 1000) (* a b c) [a b c]]
      [false 0 [0 0 0]])))

(defn solver [b]
  (let [x (solved b)]
    (if (first x)
      (second x)
      (recur (+ b 1)))))

(solver 1)
