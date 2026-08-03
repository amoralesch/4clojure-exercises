;; conditionals-3

;; Difficulty: Basic
;; Topics: conditionals

;; In others your alternative may be interesting

;; (= :glory (if (not (empty? ()))
;;                 :doom
;;                 __))

(= :glory (if (not (empty? ()))
                :doom
                :glory))
