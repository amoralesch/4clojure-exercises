;; atoms-2

;; Difficulty: Basic
;; Topics: atoms

;; You can even change at the swap meet

;; (let [atomic-clock (atom 0)]
;;       (= __ (do
;;                (swap! atomic-clock inc)
;;                @atomic-clock)))

(let [atomic-clock (atom 0)]
      (= 1 (do
               (swap! atomic-clock inc)
               @atomic-clock)))
