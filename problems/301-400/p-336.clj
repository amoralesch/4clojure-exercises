;; Separation of char and string

;; Difficulty: Elementary
;; Topics: String

;; Mission: Bikin function untuk split string berdasarkan karakter pemisah
;; dan return a vector of strings. Argumen kedua bentuknya itu regex.

;; Mission: Create a function to split a string based on a separator
;; character and return a vector of strings. The second argument is a
;; regular expression.

;; (= (__ "hello world" #" ") ["hello" "world"])

;; (= (__ "clojure,scala,haskell" #",") ["clojure" "scala" "haskell"])

;; (= (__ "one-two-three" #"-") ["one" "two" "three"])

(= (clojure.string/split "hello world" #" ") ["hello" "world"])

(= (clojure.string/split "clojure,scala,haskell" #",") ["clojure" "scala" "haskell"])

(= (clojure.string/split "one-two-three" #"-") ["one" "two" "three"])
