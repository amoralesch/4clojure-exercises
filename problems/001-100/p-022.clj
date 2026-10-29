;; Count a Sequence

;; Difficulty: Easy
;; Topics: seqs core-functions

;; Write a function which returns the total number of elements in a
;; sequence.

;; Special Restrictions
;; count

;; (= (__ '(1 2 3 3 1)) 5)

;; (= (__ "Hello World") 11)

;; (= (__ [[1 2] [3 4] [5 6]]) 3)

;; (= (__ '(13)) 1)

;; (= (__ '(:a :b :c)) 3)

(fn my-fnc [[a & b]] (if a (+ 1 (my-fnc b)) 0))

(= (my-fnc '(1 2 3 3 1)) 5)

(= (my-fnc "Hello World") 11)

(= (my-fnc [[1 2] [3 4] [5 6]]) 3)

(= (my-fnc '(13)) 1)

(= (my-fnc '(:a :b :c)) 3)
