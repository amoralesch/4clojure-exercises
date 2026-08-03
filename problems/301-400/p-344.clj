;; Thou shall not pass

;; Difficulty: Basic
;; Topics: Vector and List

;; Mission: Bikin function yang cek apakah semua elemen dalam list/vector
;; memenuhi suatu kondisi.

;; Mission: Create a function that checks whether all elements in a
;; list/vector satisfy a condition.

;; (= (__ even? [2 4 6 8]) true)

;; (= (__ #(> % 5) [6 7 8 9]) true)

;; (= (__ odd? [1 2 3 4 5]) false)

(defn my-fnc [a b]
  (cond
    (= 0 (count b)) true
    (a (first b)) (recur a (rest b))
    :else false
  )
)

(= (my-fnc even? [2 4 6 8]) true)

(= (my-fnc #(> % 5) [6 7 8 9]) true)

(= (my-fnc odd? [1 2 3 4 5]) false)
