;; conditionals-4

;; Difficulty: Basic
;; Topics: conditionals

;; You may have a multitude of possible paths

;; (let [x 5]
;;       (= :your-road (cond (= x __) :road-not-taken
;;                           (= x __) :another-road-not-taken
;;                           :else __)))

(let [x 5]
      (= :your-road (cond (= x :your-road) :road-not-taken
                          (= x :your-road) :another-road-not-taken
                          :else :your-road)))
