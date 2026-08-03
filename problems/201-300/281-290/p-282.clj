;; runtime-polymorphism-2

;; Difficulty: Basic
;; Topics: polymorphism

;; Or with many arguments

;; (let [hello (fn
;;                   ([] "Hello World!")
;;                   ([a] (str "Hello, you silly " a "."))
;;                   ([a & more] (str "Hello to this group: "
;;                                    (apply str
;;                                           (interpose ", " (concat (list a) more)))
;;                                    "!")))]
;;       (= __
;;          (hello "Peter" "Paul" "Mary")))

(let [hello (fn
                  ([] "Hello World!")
                  ([a] (str "Hello, you silly " a "."))
                  ([a & more] (str "Hello to this group: "
                                   (apply str
                                          (interpose ", " (concat (list a) more)))
                                   "!")))]
      (= "Hello to this group: Peter, Paul, Mary!"
         (hello "Peter" "Paul" "Mary")))
