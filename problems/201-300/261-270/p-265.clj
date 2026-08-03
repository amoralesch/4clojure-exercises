;; partition-1

;; Difficulty: Basic
;; Topics: partition

;; But watch out if there are not enough elements to form n sequences

;; (= (quote (__)) (partition 3 [:a :b :c :d :e]))

(= (quote ([:a :b :c])) (partition 3 [:a :b :c :d :e]))
