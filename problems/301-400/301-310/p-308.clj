;; destructuring-6

;; Difficulty: Basic
;; Topics: destructuring

;; All together now!

;; (= "Test Testerson, 123 Test Lane, Testerville, TX"
;;        (let [test-address {:street-address "123 Test Lane"
;;                            :city "Testerville"
;;                            :state "TX"}]
;;          (__ ["Test" "Testerson"] test-address)))

(= "Test Testerson, 123 Test Lane, Testerville, TX"
   (let [test-address {:street-address "123 Test Lane"
                       :city "Testerville"
                       :state "TX"}]
        (#(let [
                [[first-name last-name] {:keys [street-address city state]}] [%1 %2]
                full-name (str first-name " " last-name)]
               (clojure.string/join ", " [full-name street-address city state]))
         ["Test" "Testerson"] test-address)))
