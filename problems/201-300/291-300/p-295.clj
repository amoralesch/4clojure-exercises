;; creating-functions-0

;; Difficulty: Basic
;; Topics: functions

;; One may know what they seek by knowing what they do not seek

;; (= [__] (let [not-a-symbol? (complement symbol?)]
;;                (map not-a-symbol? [:a 'b "c"])))

(= [true false true] (let [not-a-symbol? (complement symbol?)]
               (map not-a-symbol? [:a 'b "c"])))
