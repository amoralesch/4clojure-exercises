;; partition-5

;; Difficulty: Basic
;; Topics: partition

;; .. but notice that they will only pad up to given sequence length

;; (= '( (0 1 2) (3 4 5) __) (partition 3 3 [:this :are "my" "words"] (range 7)))

(= '((0 1 2) (3 4 5) (6 :this :are))
    (partition 3 3 [:this :are "my" "words"] (range 7)))
