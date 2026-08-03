;; If we love people indiscriminately we cannot function

;; Difficulty: Elementary
;; Topics: vector and list

;; Mission: Bikin function untuk menghapus semua kelipatan dari sebuah
;; angka tertentu dari list/vector.

;; Mission: Create a function to remove all multiples of a given number
;; from a list/vector.

;; (= (__ 2 [1 2 3 4 5 6]) [1 3 5])

;; (= (__ 5 [5 10 15 20 25 30]) [])

;; (= (__ 7 [1 2 3 4 5 6]) [1 2 3 4 5 6])

(defn my-fnc [m v]
  (filter #(> (mod % m) 0) v))

(= (my-fnc 2 [1 2 3 4 5 6]) [1 3 5])

(= (my-fnc 5 [5 10 15 20 25 30]) [])

(= (my-fnc 7 [1 2 3 4 5 6]) [1 2 3 4 5 6])
