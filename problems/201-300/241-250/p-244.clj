;; maps-13

;; Difficulty: Basic
;; Topics: maps

;; Often you will need to get the keys, but the order is undependable

;; (= (list __ )
;;        (sort (keys {2010 "Vancouver" 2014 "Sochi" 2006 "Torino"})))

(= (list 2006 2010 2014 )
       (sort (keys {2010 "Vancouver" 2014 "Sochi" 2006 "Torino"})))
