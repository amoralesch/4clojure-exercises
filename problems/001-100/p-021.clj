;; Nth Element

;; Difficulty: Easy
;; Topics: seqs core-functions

;; Write a function which returns the Nth element from a sequence.

;; Special Restrictions
;; nth

;; (= (__ '(4 5 6 7) 2) 6)

;; (= (__ [:a :b :c] 0) :a)

;; (= (__ [1 2 3 4] 1) 2)

;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(= (#(first (drop %2 %1)) '(4 5 6 7) 2) 6)

(= (#(first (drop %2 %1)) [:a :b :c] 0) :a)

(= (#(first (drop %2 %1)) [1 2 3 4] 1) 2)

(= (#(first (drop %2 %1)) '([1 2] [3 4] [5 6]) 2) [5 6])
