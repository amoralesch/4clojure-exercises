;; creating-functions-4

;; Difficulty: Basic
;; Topics: functions

;; Functions can join forces as one 'composed' function

;; (= 25 (let [square (fn [x] (* x x))
;;                 inc-and-square (comp square inc)]
;;             (inc-and-square __)))

(= 25 (let [square (fn [x] (* x x))
                inc-and-square (comp square inc)]
            (inc-and-square 4)))
