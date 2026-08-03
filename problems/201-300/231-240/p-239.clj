;; maps-8

;; Difficulty: Basic
;; Topics: maps

;; But you can provide your own default

;; (= __ (get {:a 1, :b 2} :c :key-not-found))

(= :key-not-found (get {:a 1, :b 2} :c :key-not-found))
