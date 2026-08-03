;; conditionals-6

;; Difficulty: Basic
;; Topics: conditionals

;; In case of emergency, sound the alarms

;; (let [explain-defcon-level (fn [exercise-term]
;;                                  (case exercise-term
;;                                    :fade-out          :you-and-what-army
;;                                    :double-take       :call-me-when-its-important
;;                                    :round-house       :o-rly
;;                                    :fast-pace         :thats-pretty-bad
;;                                    :cocked-pistol     :sirens
;;                                    :say-what?))]
;;       (= :sirens
;;          (explain-defcon-level __)))

(let [explain-defcon-level (fn [exercise-term]
                                 (case exercise-term
                                   :fade-out          :you-and-what-army
                                   :double-take       :call-me-when-its-important
                                   :round-house       :o-rly
                                   :fast-pace         :thats-pretty-bad
                                   :cocked-pistol     :sirens
                                   :say-what?))]
      (= :sirens
         (explain-defcon-level :cocked-pistol)))
