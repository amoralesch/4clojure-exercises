;; Collection 1

;; Difficulty: Elementary
;; Topics:

;; A function can treat a collection differently depending on its type.

;; Special Restrictions
;; cons

;; (= [:a :b :c 1] (__ (vector :a :b :c) 1))

;; (= '(1 :a :b :c) (__ (list :a :b :c) 1))

(= [:a :b :c 1] ((fn [vv v] (into vv [v])) (vector :a :b :c) 1))

(= '(1 :a :b :c) ((fn [vv v] (into vv [v])) (list :a :b :c) 1))
