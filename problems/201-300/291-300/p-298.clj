;; creating-functions-3

;; Difficulty: Basic
;; Topics: functions

;; Don't forget: first things first

;; (= [:a :b __]
;;   (let [ab-adder (partial concat [:a :b])]
;;     (ab-adder [__])))

(= [:a :b :c]
  (let [ab-adder (partial concat [:a :b])]
    (ab-adder [:c])))
