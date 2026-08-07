;; To Tree, or not to Tree

;; Difficulty: Easy
;; Topics: trees

;; Write a predicate which checks whether or not a given sequence
;; represents a binary tree. Each node in the tree must have a value, a
;; left child, and a right child.

;; (= (__ '(:a (:b nil nil) nil))
;;    true)

;; (= (__ '(:a (:b nil nil)))
;;    false)

;; (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
;;    true)

;; (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
;;    false)

;; (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
;;    true)

;; (= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
;;    false)

;; (= (__ '(:a nil ()))
;;    false)

(defn binary? [val]
  (and
    (sequential? val)
    (= 3 (count val))
    (let [left (second val)
          right (last val)]
      (and
        (or
          (nil? left)
          (binary? left))
        (or
          (nil? right)
          (binary? right))
      )
    )
  )
)

(= (binary? '(:a (:b nil nil) nil))
   true)

(= (binary? '(:a (:b nil nil)))
   false)

(= (binary? [1 nil [2 [3 nil nil] [4 nil nil]]])
   true)

(= (binary? [1 [2 nil nil] [3 nil nil] [4 nil nil]])
   false)

(= (binary? [1 [2 [3 [4 nil nil] nil] nil] nil])
   true)

(= (binary? [1 [2 [3 [4 false nil] nil] nil] nil])
   false)

(= (binary? '(:a nil ()))
   false)
