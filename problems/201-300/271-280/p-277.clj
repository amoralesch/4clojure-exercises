;; higher-order-functions-7

;; Difficulty: Basic
;; Topics: functions

;; Reducing can increase the result

;; (= __ (reduce (fn [a b] (* a b)) [1 2 3 4]))

(= 24 (reduce (fn [a b] (* a b)) [1 2 3 4]))
