;; lazy-sequences-6

;; Difficulty: Basic
;; Topics: sequences

;; Iteration can be used for repetition

;; (= (repeat 100 :foo)
;;        (take 100 (iterate __ :foo)))

(= (repeat 100 :foo)
       (take 100 (iterate identity :foo)))
