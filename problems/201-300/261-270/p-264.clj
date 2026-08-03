;; partition-0

;; Difficulty: Basic
;; Topics: partition

;; To split a collection you can use the partition function

;; (= '((0 1) (2 3)) (__ 2 (range 4)))

(= '((0 1) (2 3)) (partition 2 (range 4)))
