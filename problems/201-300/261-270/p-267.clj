;; partition-3

;; Difficulty: Basic
;; Topics: partition

;; If you need to, you can start each sequence with an offset

;; (= '((0 1 2) (5 6 7) (10 11 12)) (partition 3 __ (range 13)))

(= '((0 1 2) (5 6 7) (10 11 12)) (partition 3 5 (range 13)))
