;; Recency bias

;; Difficulty: Elementary
;; Topics: Map

;; Mission: Bikin function yang menggabungkan dua map. Jika terdapat
;; kunci yang sama, nilai dari map kedua yang akan digunakan.

;; Mission: Create a function that merges two maps. If there are the same
;; keys, the value from the second map will be used.

;; (= (__ {:a 1 :b 2} {:b 3 :c 4}) {:a 1 :b 3 :c 4})

;; (= (__ {:name "Clojure"} {:age 15}) {:name "Clojure" :age 15})

;; (= (__ {:x 1} {:x 2 :y 2}) {:x 2 :y 2})

(= (merge {:a 1 :b 2} {:b 3 :c 4}) {:a 1 :b 3 :c 4})

(= (merge {:name "Clojure"} {:age 15}) {:name "Clojure" :age 15})

(= (merge {:x 1} {:x 2 :y 2}) {:x 2 :y 2})
