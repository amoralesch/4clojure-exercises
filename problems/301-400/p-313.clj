;; atoms-4

;; Difficulty: Basic
;; Topics: atoms

;; Any number of arguments might happen during a swap

;; (let [atomic-clock (atom 0)]
;;       (= __ (do
;;                (swap! atomic-clock + 1 2 3 4 5)
;;                @atomic-clock)))

(let [atomic-clock (atom 0)]
      (= 15 (do
               (swap! atomic-clock + 1 2 3 4 5)
               @atomic-clock)))
