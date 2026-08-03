;; atoms-5

;; Difficulty: Basic
;; Topics: atoms

;; Atomic atoms are atomic

;; (let [atomic-clock (atom 0)]
;;       (= __ (do
;;                (compare-and-set! atomic-clock 100 :fin)
;;                @atomic-clock)))

(let [atomic-clock (atom 0)]
      (= 0 (do
               (compare-and-set! atomic-clock 100 :fin)
               @atomic-clock)))
