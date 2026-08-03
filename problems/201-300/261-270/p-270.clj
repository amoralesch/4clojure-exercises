;; higher-order-functions-0

;; Difficulty: Basic
;; Topics: functions

;; The map function relates a sequence to another

;; (= (quote (__)) (map (fn [x] (* 4 x)) [1 2 3]))

(= (quote (4 8 12)) (map (fn [x] (* 4 x)) [1 2 3]))
