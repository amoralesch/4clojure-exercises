;; Get the Caps

;; Difficulty: Easy
;; Topics: strings

;; Write a function which takes a string and returns a new string
;; containing only the capital letters.

;; (= (__ "HeLlO, WoRlD!") "HLOWRD")

;; (empty? (__ "nothing"))

;; (= (__ "$#A(*&987Zf") "AZ")

(= (#(apply str (re-seq #"[A-Z]" %)) "HeLlO, WoRlD!") "HLOWRD")

(empty? (#(apply str (re-seq #"[A-Z]" %)) "nothing"))

(= (#(apply str (re-seq #"[A-Z]" %)) "$#A(*&987Zf") "AZ")
