;; higher-order-functions-4

;; Difficulty: Basic
;; Topics: functions

;; Or very weak

;; (= __ (filter (fn [x] true) (quote (:anything :goes :here))))

(= '(:anything :goes :here)
    (filter (fn [x] true) (quote (:anything :goes :here))))
