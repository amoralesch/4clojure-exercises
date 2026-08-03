;; partition-4

;; Difficulty: Basic
;; Topics: partition

;; Consider padding the last sequence with some default values..

;; (= '((0 1 2) (3 4 5) (6 :hello)) (partition 3 3 [__] (range 7)))

(= '((0 1 2) (3 4 5) (6 :hello)) (partition 3 3 [:hello] (range 7)))
