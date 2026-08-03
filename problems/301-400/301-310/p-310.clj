;; atoms-1

;; Difficulty: Basic
;; Topics: atoms

;; You can get its value more succintly

;; (let [atomic-clock (atom 0)]
;;       (= __ @atomic-clock))

(let [atomic-clock (atom 0)]
      (= 0 @atomic-clock))
