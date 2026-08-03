;; Give me your position

;; Difficulty: Elementary
;; Topics: String

;; Mission: Bikin function untuk temukan posisi pertama karakter tertentu
;; dalam sebuah string.

;; Mission: Create a function to find the first position of a specific
;; character in a string.

;; (= (__ "hello world" "w") 6)

;; (= (__ "clojure" "j") 3)

;; (= (__ "functional" "n") 2)

(= (clojure.string/index-of "hello world" "w") 6)

(= (clojure.string/index-of "clojure" "j") 3)

(= (clojure.string/index-of "functional" "n") 2)
