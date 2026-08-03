;; higher-order-functions-3

;; Difficulty: Basic
;; Topics: functions

;; A filter can be strong

;; (= __ (filter (fn [x] false) (quote (:anything :goes :here))))

(= '() (filter (fn [x] false) (quote (:anything :goes :here))))
