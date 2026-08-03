;; sequence-comprehensions-0

;; Difficulty: Basic
;; Topics: comprehensions

;; Sequence comprehensions can bind each element in turn to a symbol

;; (= __ (for [index (range 6)] index))

(= '(0 1 2 3 4 5) (for [index (range 6)] index))
