;; higher-order-functions-1

;; Difficulty: Basic
;; Topics: functions

;; You may create that mapping

;; (= (quote (1 4 9 16 25)) (map (fn [x] __) [1 2 3 4 5]))

(= (quote (1 4 9 16 25)) (map (fn [x] (* x x)) [1 2 3 4 5]))
