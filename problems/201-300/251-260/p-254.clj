;; functions-8

;; Difficulty: Basic
;; Topics: functions

;; Higher-order functions take function arguments

;; (= 25 (__
;;            (fn [n] (* n n))))

(= 25 (#(%2 %1) 5
           (fn [n] (* n n))))
