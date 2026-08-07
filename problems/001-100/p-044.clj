;; Rotate Sequence

;; Difficulty: Medium
;; Topics: seqs

;; Write a function which can rotate a sequence in either direction.

;; (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))

;; (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))

;; (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))

;; (= (__ 1 '(:a :b :c)) '(:b :c :a))

;; (= (__ -4 '(:a :b :c)) '(:c :a :b))


(defn my-fnc [a b]
    (let
        [d (if
            (> a 0) a
            (inc (* -1 a)))]
        (take (count b)
            (drop d (cycle b)))))

(= (my-fnc 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (my-fnc -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (my-fnc 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (my-fnc 1 '(:a :b :c)) '(:b :c :a))

(= (my-fnc -4 '(:a :b :c)) '(:c :a :b))
