;; destructuring-5

;; Difficulty: Basic
;; Topics: destructuring

;; Or more succinctly

;; (= "123 Test Lane, Testerville, TX"
;;    (let [test-address {:street-address "123 Test Lane"
;;                        :city "Testerville"
;;                        :state "TX"}
;;      {:keys [street-address __]} test-address]
;;      (str street-address ", " city ", " state)))

(= "123 Test Lane, Testerville, TX"
   (let [test-address {:street-address "123 Test Lane"
                       :city "Testerville"
                       :state "TX"}
     {:keys [street-address city state]} test-address]
     (str street-address ", " city ", " state)))
