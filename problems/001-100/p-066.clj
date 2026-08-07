;; Greatest Common Divisor

;; Difficulty: Easy
;; Topics:

;; Given two integers, write a function which returns the greatest common
;; divisor.

;; (= (__ 2 4) 2)

;; (= (__ 10 5) 5)

;; (= (__ 5 7) 1)

;; (= (__ 1023 858) 33)

(defn my-fnc []
  (if (<= %2 0) %1 (recur %2 (mod %1 %2))))

(= (my-fnc 2 4) 2)

(= (my-fnc 10 5) 5)

(= (my-fnc 5 7) 1)

(= (my-fnc 1023 858) 33)
