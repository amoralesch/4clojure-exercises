;; sequence-comprehensions-1

;; Difficulty: Basic
;; Topics: comprehensions

;; They can easily emulate mapping

;; (= (quote (0 1 4 9 16 25)) (map (fn [index] (* index index)) (range 6)) (for [index (range 6)] __))

(= (quote (0 1 4 9 16 25))
   (map (fn [index] (* index index)) (range 6))
   (for [index (range 6)] (* index index)))
