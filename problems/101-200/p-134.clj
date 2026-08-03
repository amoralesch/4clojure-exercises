;; A nil key

;; Difficulty: Elementary
;; Topics: maps

;; Write a function which, given a key and map, returns true iff the map
;; contains an entry with that key and its value is nil.

;; (true?  (__ :a {:a nil :b 2}))

;; (false? (__ :b {:a nil :b 2}))

;; (false? (__ :c {:a nil :b 2}))

(defn my-fnc [k m]
  (let [v (m k)]
    (if (contains? m k) (not v) false)))

(true?  (my-fnc :a {:a nil :b 2}))

(false? (my-fnc :b {:a nil :b 2}))

(false? (my-fnc :c {:a nil :b 2}))
