;; functions-9

;; Difficulty: Basic
;; Topics: functions

;; But they are often better written using the names of functions

;; (let [square (fn [x] (* x x))]
;;     (= 25 (__ square)))

(let [square (fn [x] (* x x))]
    (= 25 (#(%2 %1) 5 square)))
