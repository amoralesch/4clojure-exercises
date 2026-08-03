;; destructuring-1

;; Difficulty: Basic
;; Topics: destructuring

;; Whether in function definitions

;; (= (str "First comes love, "
;;             "then comes marriage, "
;;             "then comes Clojure with the baby carriage")
;;        ((fn [[a b c]] __)
;;         ["love" "marriage" "Clojure"]))

(= (str "First comes love, "
        "then comes marriage, "
        "then comes Clojure with the baby carriage")
   ((fn [[a b c]]
        (str "First comes " a
             ", then comes " b
             ", then comes " c
             " with the baby carriage"))
        ["love" "marriage" "Clojure"]))
