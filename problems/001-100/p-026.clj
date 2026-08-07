;; Fibonacci Sequence

;; Difficulty: Easy
;; Topics: fibonacci seqs

;; Write a function which returns the first X fibonacci numbers.

;; (= (__ 3) '(1 1 2))

;; (= (__ 6) '(1 1 2 3 5 8))

;; (= (__ 8) '(1 1 2 3 5 8 13 21))

(defn fib [count]
      (last
            (take count
                  (iterate
                    #(conj % (reduce + (take-last 2 %)))
                    [1]))))

(= (fib 3) '(1 1 2))

(= (fib 6) '(1 1 2 3 5 8))

(= (fib 8) '(1 1 2 3 5 8 13 21))
