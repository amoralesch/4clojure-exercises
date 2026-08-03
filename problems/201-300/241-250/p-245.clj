;; maps-14

;; Difficulty: Basic
;; Topics: maps

;; You can get the values in a similar way

;; (= (list __)
;;        (sort (vals {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"})))

(= (list "Sochi" "Torino" "Vancouver")
       (sort (vals {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"})))
