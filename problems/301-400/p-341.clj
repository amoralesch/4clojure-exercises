;; Merry go round a bit

;; Difficulty: Elementary
;; Topics: List Vector

;; Mission: Bikin function untuk "rotate" elemen-elemen dalam list/vector.
;; Artinya, elemen terakhir menjadi elemen pertama.

;; Mission: Create a function to "rotate" the elements in a list/vector.
;; This means the last element becomes the first element.

;; (= (__ [1 2 3 4 5]) [5 1 2 3 4])

;; (= (__ ["Clojure" "Scala" "Haskell" "Elixir"]) ["Elixir" "Clojure" "Scala" "Haskell"])

;; (= (__ [true false true]) [true true false])

(= (#(concat [(last %)] (take (- (count %) 1) %)) [1 2 3 4 5])
   [5 1 2 3 4])

(= (#(concat [(last %)] (take (- (count %) 1) %)) ["Clojure" "Scala" "Haskell" "Elixir"])
   ["Elixir" "Clojure" "Scala" "Haskell"])

(= (#(concat [(last %)] (take (- (count %) 1) %)) [true false true])
   [true true false])
