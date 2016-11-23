(ns euler.euler-006)



(int (- (Math/pow (reduce + (range 1 101)) 2) (reduce + (map #(* % %) (range 1 101)))))
