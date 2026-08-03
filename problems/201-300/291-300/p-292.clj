;; sequence-comprehensions-2

;; Difficulty: Basic
;; Topics: comprehensions

;; And also filtering

;; (= (quote (1 3 5 7 9)) (filter odd? (range 10)) (for [index __ :when (odd? index)] index))

(= (quote (1 3 5 7 9))
   (filter odd? (range 10))
   (for [index (range 10) :when (odd? index)] index))
