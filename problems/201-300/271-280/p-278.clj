;; higher-order-functions-8

;; Difficulty: Basic
;; Topics: functions

;; You can start somewhere else

;; (= 2400 (reduce (fn [a b] (* a b)) __ [1 2 3 4]))

(= 2400 (reduce (fn [a b] (* a b)) 100 [1 2 3 4]))
