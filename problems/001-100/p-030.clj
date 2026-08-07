;; Compress a Sequence

;; Difficulty: Easy
;; Topics: seqs

;; Write a function which removes consecutive duplicates from a sequence.

;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")

;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

(= (apply str (dedupe "Leeeeeerrroyyy")) "Leroy")

(= (dedupe [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (dedupe [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
