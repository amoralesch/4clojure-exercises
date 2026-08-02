;; sets-3

;; Difficulty: Basic
;; Topics: sets

;; You can ask clojure for the union of two sets

;; (= __ (clojure.set/union #{1 4 3 2} #{3 2 5}))

(= #{1 2 3 4 5} (clojure.set/union #{1 4 3 2} #{3 2 5}))
