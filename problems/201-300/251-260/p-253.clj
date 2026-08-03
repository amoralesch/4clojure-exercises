;; functions-7

;; Difficulty: Basic
;; Topics: functions

;; Functions can also take other functions as input

;; (= 20 ((fn [f] (f 4 5))
;;            __))

(= 20 ((fn [f] (f 4 5))
           *))
