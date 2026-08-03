;; lazy-sequences-4

;; Difficulty: Basic
;; Topics: sequences

;; Iteration provides an infinite lazy sequence

;; (= __ (take 20 (iterate inc 0)))

(= '(0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19)
    (take 20 (iterate inc 0)))
