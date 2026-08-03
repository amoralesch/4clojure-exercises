;; runtime-polymorphism-1

;; Difficulty: Basic
;; Topics: polymorphism

;; With one argument

;; (let [hello (fn
;;                   ([] "Hello World!")
;;                   ([a] (str "Hello, you silly " a ".")))]
;;       (= __ (hello "world")))

(let [hello (fn
                  ([] "Hello World!")
                  ([a] (str "Hello, you silly " a ".")))]
      (= "Hello, you silly world." (hello "world")))
