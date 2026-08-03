;; Strings 2

;; Difficulty: Elementary
;; Topics:

;; Clojure also has string manipulation functions similiar to java's
;; .toUpperCase clojure.string

;; Special Restrictions
;; toLowerCase

;; (= "hello world" (__ "HELLO WORLD"))

(= "hello world" (clojure.string/lower-case "HELLO WORLD"))
