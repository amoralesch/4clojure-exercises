;; destructuring-2

;; Difficulty: Basic
;; Topics: destructuring

;; Or in let expressions

;; (= "Rich Hickey aka The Clojurer aka Go Time aka Macro Killah"
;;        (let [[first-name last-name & aliases]
;;              (list "Rich" "Hickey" "The Clojurer" "Go Time" "Macro Killah")]
;;          __))

(= "Rich Hickey aka The Clojurer aka Go Time aka Macro Killah"
   (let [[first-name last-name & aliases]
         (list "Rich" "Hickey" "The Clojurer" "Go Time" "Macro Killah")]
        (str first-name " "
             last-name " aka "
             (clojure.string/join " aka " aliases))))
