;; When you have the key you can replace the value

;; Difficulty: Elementary
;; Topics: Map

;; Mission: Bikin function untuk update nilai berdasarkan kunci di dalam
;; map. Jika kunci tidak ditemukan, tambahkan kunci tersebut dengan nilai
;; yang diberikan.

;; Mission: Create a function to update a value based on a key in the map.
;; If the key is not found, add the given value to it.

;; (= (__ {:a 1 :b 2} :b 3) {:a 1 :b 3})

;; (= (__ {:a 1 :b 2} :c 3) {:a 1 :b 2 :c 3})

;; (= (__ {} :a 1) {:a 1})

(= (#(merge %1 {%2 %3}) {:a 1 :b 2} :b 3) {:a 1 :b 3})

(= (#(merge %1 {%2 %3}) {:a 1 :b 2} :c 3) {:a 1 :b 2 :c 3})

(= (#(merge %1 {%2 %3}) {} :a 1) {:a 1})
