;; You are replaceable

;; Difficulty: Elementary
;; Topics: String

;; Mission: Bikin function untuk replace karakter tertentu dalam string
;; dengan karakter lain. Argumen pertama character yg mau diganti, argumen
;; kedua adalah character penggantinya. Jangan lupa ada clojure.string
;; library untuk string manipulation.

;; Mission: Create a function to replace a specific character in a string
;; with another character. The first argument is the character to be
;; replaced, and the second argument is the replacement character. Don't
;; forget the clojure.string library for string manipulation.

;; (= (__ "hello world" "o" "0") "hell0 w0rld")

;; (= (__ "clojure rocks" "o" "0") "cl0jure r0cks")

;; (= (__ "functional programming" "n" "-") "fu-ctio-al programmi-g")

(= (clojure.string/replace "hello world" "o" "0") "hell0 w0rld")

(= (clojure.string/replace "clojure rocks" "o" "0") "cl0jure r0cks")

(= (clojure.string/replace "functional programming" "n" "-") "fu-ctio-al programmi-g")
