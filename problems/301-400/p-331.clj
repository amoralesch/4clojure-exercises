;; Reverse a string

;; Difficulty: Elementary
;; Topics: String list

;; Create a function to reverse a string. Given a string, return the
;; reverse of that string in the form of string

;; (= (__ "Hello World") "dlroW olleH")

;; (= (__ "kasur ini rusak") "kasur ini rusak")

(= (#(apply str (reverse %)) "Hello World") "dlroW olleH")

(= (#(apply str (reverse %)) "kasur ini rusak") "kasur ini rusak")
