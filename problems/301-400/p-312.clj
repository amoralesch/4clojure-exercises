;; atoms-3

;; Difficulty: Basic
;; Topics: atoms

;; Keep taxes out of this: swapping requires no transaction

;; (let [atomic-clock (atom 0)]
;;       (= 5 (do
;;              __
;;              @atomic-clock)))

(let [atomic-clock (atom 0)]
      (= 5 (do
             (swap! atomic-clock #(+ % 5))
             @atomic-clock)))
