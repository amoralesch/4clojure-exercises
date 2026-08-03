;; atoms-0

;; Difficulty:	Basic
;; Topics:	atoms

;; Atoms are references to values

;; (let [atomic-clock (atom 0)]
;;       (= __ (deref atomic-clock)))

(let [atomic-clock (atom 0)]
      (= 0 (deref atomic-clock)))
