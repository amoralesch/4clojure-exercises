;; higher-order-functions-9

;; Difficulty: Basic
;; Topics: functions

;; Numbers are not the only things one can reduce

;; (= "longest" (reduce (fn [a b]
;;                            (if (< __) b a))
;;                          ["which" "is" "the" "longest" "word"]))

(= "longest" (reduce (fn [a b]
                           (if (< (count a) (count b)) b a))
                         ["which" "is" "the" "longest" "word"]))
