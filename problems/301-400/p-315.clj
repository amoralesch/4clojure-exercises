;; atoms-6

;; Difficulty: Basic
;; Topics: atoms

;; When your expectations are aligned with reality things, proceed that way

;; (let [atomic-clock (atom 0)]
;;       (= :fin (do
;;                 (compare-and-set! __)
;;                 @atomic-clock)))

(let [atomic-clock (atom 0)]
      (= :fin (do
                (compare-and-set! atomic-clock 0 :fin)
                @atomic-clock)))
