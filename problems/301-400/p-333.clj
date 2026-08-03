;; Extracting Private Ryan

;; Difficulty: Basic
;; Topics: String

;; Buatlah fungsi extract-substring yang menerima tiga argumen, sebuah
;; string, posisi awal, dan panjang substring, dan mengembalikan
;; substring tersebut.

;; Create an extract-substring function that accepts three arguments, a
;; string, the starting position, and the length of the substring, and
;; returns the substring.

;; (= (__ "Saving Private Ryan" 7 19) "Private Ryan")

;; (= (__ "Jellow world    " 0 12) "Jellow world")

(defn my-fnc
    [s start end]
    (apply str
         (take (- end start)
               (drop start s))))

(= (my-fnc "Saving Private Ryan" 7 19) "Private Ryan")

(= (my-fnc "Jellow world    " 0 12) "Jellow world")
