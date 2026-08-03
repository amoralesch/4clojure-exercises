;; Entangled

;; Difficulty: Elementary
;; Topics: String List

;; Mission: Bikin function untuk "interleave" dua string, artinya
;; bergantian menggabungkan karakter dari dua string tersebut.

;; Mission: Create a function to "interleave" two strings, meaning
;; alternately combine characters from the two strings.

;; (= (__ "abc" "123") "a1b2c3")

;; (= (__ "hello" "world") "hweolrllod")

;; (= (__ "Clojure" "Rocks") "CRloocjkus re")

(defn my-fnc [v1 v2]
   (let [extra? (not= (count v1) (count v2))]
        (apply str
               (apply str (interleave v1 v2))
               (if extra? " ")
               (if extra? (apply str (drop (count v1) v2)))
               (if extra? (apply str (drop (count v2) v1))))))

(= (my-fnc "abc" "123") "a1b2c3")

(= (my-fnc "hello" "world") "hweolrllod")

(= (my-fnc "Clojure" "Rocks") "CRloocjkus re")
