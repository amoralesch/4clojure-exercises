;; conditionals-7

;; Difficulty: Basic
;; Topics: conditionals

;; But admit it when you don't know what to do

;; (let [explain-defcon-level (fn [exercise-term]
;;                                  (case exercise-term
;;                                    :fade-out          :you-and-what-army
;;                                    :double-take       :call-me-when-its-important
;;                                    :round-house       :o-rly
;;                                    :fast-pace         :thats-pretty-bad
;;                                    :cocked-pistol     :sirens
;;                                    :say-what?))]
;;       (= __
;;          (explain-defcon-level :yo-mama)))

(let [explain-defcon-level (fn [exercise-term]
                                 (case exercise-term
                                   :fade-out          :you-and-what-army
                                   :double-take       :call-me-when-its-important
                                   :round-house       :o-rly
                                   :fast-pace         :thats-pretty-bad
                                   :cocked-pistol     :sirens
                                   :say-what?))]
      (= :say-what?
         (explain-defcon-level :yo-mama)))
