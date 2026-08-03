;; Unnecessary keribetan

;; Difficulty: Elementary
;; Topics:	Mikir dikit

;; Mission: Bikin function yang menerima dua list/vector, mengalikan
;; setiap elemen pada list pertama dengan elemen pada posisi yang sama di
;; list kedua, lalu mengembalikan hanya hasil kali yang ganjil.

;; Mission: Create a function that accepts two lists/vectors, multiplies
;; each element in the first list by the element at the same position in
;; the second list, and then returns only the odd products.

;; (= (__ [1 2 3 4] [5 6 7 8]) [5 21])

;; (= (__ [10 20 30] [3 5 7]) [])

;; (= (__ [0 1 2 3] [2 3 4 5]) [3 15])

(defn my-fnc [u d]
  (filter #(odd? %)
          (map * u d)))

(= (my_fnc [1 2 3 4] [5 6 7 8]) [5 21])

(= (my_fnc [10 20 30] [3 5 7]) [])

(= (my_fnc [0 1 2 3] [2 3 4 5]) [3 15])
