;; Prime Numbers

;; Difficulty: Medium
;; Topics: primes

;; Write a function which returns the first x number of prime numbers.

;; (= (__ 2) [2 3])

;; (= (__ 5) [2 3 5 7 11])

;; (= (last (__ 100)) 541)

(defn my-fnc [c]
  (take c
    (filter
      (fn [n]
        (loop [i 2, m (java.lang.Math/sqrt n)]
        (cond
          (> i m) true
          (= 0 (mod n i)) false
          :else (recur (inc i) m))))
      (iterate inc 2))))

(= (my_fnc 2) [2 3])

(= (my_fnc 5) [2 3 5 7 11])

(= (last (my_fnc 100)) 541)
