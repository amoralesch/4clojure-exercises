;; Pecking order

;; Difficulty: Elementary
;; Topics: List Vector

;; Mission: Bikin function untuk masukin elemen di posisi tertentu dalam
;; list/vector.

;; Mission: Create a function to insert an element at a specific position
;; in a list/vector.

;; (= (__ 2 "a" [1 2 3 4]) [1 2 "a" 3 4])

;; (= (__ 0 "Clojure" ["Scala" "Haskell"]) ["Clojure" "Scala" "Haskell"])

;; (= (__ 1 false [true true]) [true false true])

(= (#(concat (take %1 %3) [%2] (nthrest %3 %1)) 2 "a" [1 2 3 4])
   [1 2 "a" 3 4])

(= (#(concat (take %1 %3) [%2] (nthrest %3 %1)) 0 "Clojure" ["Scala" "Haskell"])
   ["Clojure" "Scala" "Haskell"])

(= (#(concat (take %1 %3) [%2] (nthrest %3 %1)) 1 false [true true])
   [true false true])
