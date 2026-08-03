;; sequence-comprehensions-3

;; Difficulty: Basic
;; Topics: comprehensions

;; Combinations of these transformations is trivial

;; (= (quote (1 9 25 49 81)) (map (fn [index] (* index index)) (filter odd? (range 10))) (for [index (range 10) :when __] __))

(= (quote (1 9 25 49 81))
   (map (fn [index] (* index index)) (filter odd? (range 10)))
   (for [index (range 10) :when (if (odd? index) (* index index))]
        (if (odd? index) (* index index))))
