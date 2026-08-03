;; creating-functions-5

;; Difficulty: Basic
;; Topics: functions

;; Have a go on a double dec-er

;; (= __ (let [double-dec (comp dec dec)]
;;              (double-dec 10)))

(= 8 (let [double-dec (comp dec dec)]
             (double-dec 10)))
