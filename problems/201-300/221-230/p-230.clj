;; sets-5

;; Difficulty: Basic
;; Topics: sets

;; But don't forget about the difference

;; (= __ (clojure.set/difference #{1 4 3 2 5} #{3 2 5}))

(= #{1 4} (clojure.set/difference #{1 4 3 2 5} #{3 2 5}))
