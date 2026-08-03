;; creating-functions-2

;; Difficulty: Basic
;; Topics: functions

;; Partial functions allow procrastination

;; (= 20 (let [multiply-by-5 (partial * 5)]
;;             (__)))

(= 20 (let [multiply-by-5 (partial * 5)]
            (multiply-by-5 4)))
