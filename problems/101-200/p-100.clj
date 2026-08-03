;; Least Common Multiple

;; Difficulty: Easy
;; Topics: math

;; Write a function which calculates the least common multiple. Your
;; function should accept a variable number of positive integers or ratios.

;; (== (__ 2 3) 6)

;; (== (__ 5 3 7) 105)

;; (== (__ 1/3 2/5) 2)

;; (== (__ 3/4 1/6) 3/2)

;; (== (__ 7 5/7 2 3/5) 210)

(defn my-fnc [& vv]
  (letfn [(gcd [a b] (if (<= b 0) a (recur b (mod a b))))
          (lcm [a b] (/ (* a b) (gcd a b)))]
  (reduce lcm vv)))

(== (my-fnc 2 3) 6)

(== (my-fnc 5 3 7) 105)

(== (my-fnc 1/3 2/5) 2)

(== (my-fnc 3/4 1/6) 3/2)

(== (my-fnc 7 5/7 2 3/5) 210)
