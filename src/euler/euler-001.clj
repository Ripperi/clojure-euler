(ns euler.euler-001)

(def l (filter (fn [x]
                 (or (= 0 (mod x 3)) (= 0 (mod x 5)))) (range 1000)))
(reduce + l)
