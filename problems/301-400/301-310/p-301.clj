;; creating-functions-6

;; Difficulty: Basic
;; Topics: functions

;; Be careful about the order in which you mix your functions

;; (= 99 (let [square-and-dec __]
;;             (square-and-dec 10)))

(= 99 (let [square-and-dec (comp dec #(* % %))]
            (square-and-dec 10)))
