;; runtime-polymorphism-0

;; Difficulty: Basic
;; Topics: polymorphism

;; Some functions can be used in different ways - with no arguments

;; (let [hello (fn ([] "Hello World!"))]
;;       (= __ (hello)))

(let [hello (fn ([] "Hello World!"))]
      (= "Hello World!" (hello)))
