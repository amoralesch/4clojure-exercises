;; A Test of character

;; Difficulty: Elementary
;; Topics: String Character

;; Create a function to test whether a string contains a character (in
;; the form of string).

;; (= (__ "Hello World" "W") true)

;; (= (__ "Hello World" "w") false)

;; (= (__ "Trim a cat" "e") false)

;; (= (__ "Budi beli bola loba" " ") true)

(= ((fn [f v] (> (.indexOf f v) -1)) "Hello World" "W") true)

(= ((fn [f v] (> (.indexOf f v) -1)) "Hello World" "w") false)

(= ((fn [f v] (> (.indexOf f v) -1)) "Trim a cat" "e") false)

(= ((fn [f v] (> (.indexOf f v) -1)) "Budi beli bola loba" " ") true)
