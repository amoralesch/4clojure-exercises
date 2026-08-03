;; destructuring-0

;; Difficulty: Basic
;; Topics: destructuring

;; Destructuring is an arbiter: it breaks up arguments

;; (= __ ((fn [[a b]] (str b a))
;;             [:foo :bar]))

(= ":bar:foo" ((fn [[a b]] (str b a))
            [:foo :bar]))
