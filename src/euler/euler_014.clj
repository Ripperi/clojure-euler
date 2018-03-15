(ns euler.euler-014)

(defn next-iteration
  [n]
  (if (even? n)
    (/ n 2)
    (inc (* 3 n))))

(defn seq-count
  [n]
  (loop [cur n
         cnt 1]
    (if (= 1 cur)
      cnt
      (recur (next-iteration cur) (inc cnt)))))

(defn reducer
  [l-map r-num]
  (let [r-map {:number r-num :count (seq-count r-num)}]
    (max-key :count l-map r-map)))

(defn longest-under
  [n]
  (time (reduce reducer {:number 1 :count 1} (range 2 n))))

(defn main []
  (longest-seq-producer-under 1000000))
