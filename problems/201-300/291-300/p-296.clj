;; creating-functions-1

;; Difficulty: Basic
;; Topics: functions

;; Praise and 'complement' may help you separate the wheat from the chaff

;; (= [:wheat "wheat" 'wheat]
;;        (let [not-nil? __]
;;          (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))

(= [:wheat "wheat" 'wheat]
       (let [not-nil? (complement nil?)]
         (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))
