;; functions-1

;; Difficulty: Basic
;; Topics: functions

;; Functions are usually defined before they are used

;; (let [multiply-by-ten (fn [n] (* 10 n))]
;;       (= __ (multiply-by-ten 2)))

(let [multiply-by-ten (fn [n] (* 10 n))]
      (= 20 (multiply-by-ten 2)))
