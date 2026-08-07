;; Beauty is Symmetry

;; Difficulty: Easy
;; Topics: trees

;; Let us define a binary tree as "symmetric" if the left half of the
;; tree is the mirror image of the right half of the tree. Write a
;; predicate to determine whether or not a given binary tree is symmetric.
;; (see To Tree, or not to Tree for a reminder on the tree representation
;; we're using).

;; (= (__ '(:a (:b nil nil) (:b nil nil))) true)

;; (= (__ '(:a (:b nil nil) nil)) false)

;; (= (__ '(:a (:b nil nil) (:c nil nil))) false)

;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;           [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
;;    true)

;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;           [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
;;    false)

;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;           [2 [3 nil [4 [6 nil nil] nil]] nil]])
;;    false)

(defn my-fnc [s]
  (let [left (second s)
        right (last s)
        mirror (fn mirror [tree]
                 (let [l (second tree)
                       r (last tree)]
                   (if
                     (and (nil? l) (nil? r)) tree
                     (list
                      (first tree)
                      (if (sequential? r) (mirror r) r)
                      (if (sequential? l) (mirror l) l)
                     )
                   )
                 )
               )
       ]
    (= left (if
              (sequential? right)
              (mirror right)
              right
            )
    )
  )
)

(= (my-fnc '(:a (:b nil nil) (:b nil nil))) true)

(= (my-fnc '(:a (:b nil nil) nil)) false)

(= (my-fnc '(:a (:b nil nil) (:c nil nil))) false)

(= (my-fnc [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
   true)

(= (my-fnc [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
   false)

(= (my-fnc [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] nil]] nil]])
   false)
