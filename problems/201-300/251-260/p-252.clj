;; functions-6

;; Difficulty: Basic
;; Topics: functions

;; One function can beget another

;; (= 9 (((fn [] __)) 4 5))

(= 9 (((fn [] +)) 4 5))
