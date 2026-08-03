;; maps-11

;; Difficulty: Basic
;; Topics: maps

;; Maps are immutable, but you can create a new and improved version

;; (= {1 "January", 2 __} (assoc {1 "January"} 2 "February"))

(= {1 "January", 2 "February"} (assoc {1 "January"} 2 "February"))
