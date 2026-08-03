;; higher-order-functions-5

;; Difficulty: Basic
;; Topics: functions

;; Or somewhere in between

;; (= [10 20 30] (filter (fn [x] __) [10 20 30 40 50 60 70 80]))

(= [10 20 30] (filter (fn [x] (< x 31)) [10 20 30 40 50 60 70 80]))
