;; destructuring-4

;; Difficulty: Basic
;; Topics: destructuring

;; Break up maps by key

;; (= "123 Test Lane, Testerville, TX"
;;      (let [test-address {:street-address "123 Test Lane"
;;                          :city "Testerville"
;;                          :state "TX"}
;;            {street-address :street-address, city :city, state :state} test-address]
;;        __))

(= "123 Test Lane, Testerville, TX"
     (let [test-address {:street-address "123 Test Lane"
                         :city "Testerville"
                         :state "TX"}
           {street-address :street-address, city :city, state :state} test-address]
       (str street-address ", " city ", " state)))
