;; Maps

;; Difficulty: Elementary
;; Topics:

;; Maps store key-value pairs. Both maps and keywords can be used as
;; lookup functions. Commas are whitespace.

;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))

;; (= __ (:b {:a 10, :b 20, :c 30}))

(= 20 ((hash-map :a 10, :b 20, :c 30) :b))

(= 20 (:b {:a 10, :b 20, :c 30}))
