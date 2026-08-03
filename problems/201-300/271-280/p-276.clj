;; higher-order-functions-6

;; Difficulty: Basic
;; Topics: functions

;; Maps and filters may be combined

;; (= [10 20 30] (map (fn [x] __) (filter (fn [x] __) [1 2 3 4 5 6 7 8])))

(= [10 20 30]
(map (fn [x] (if (< x 4) (* x 10)))
     (filter (fn [x] (if (< x 4) (* x 10))) [1 2 3 4 5 6 7 8])))
