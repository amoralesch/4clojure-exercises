;; destructuring-3

;; Difficulty: Basic
;; Topics: destructuring

;; You can regain the full argument if you like arguing

;; (= {:original-parts ["Stephen" "Hawking"] :named-parts {:first "Stephen" :last "Hawking"}}
;;        (let [[first-name last-name :as full-name] ["Stephen" "Hawking"]]
;;          __))

(= {
    :original-parts ["Stephen" "Hawking"]
    :named-parts {:first "Stephen" :last "Hawking"}}
   (let [[first-name last-name :as full-name] ["Stephen" "Hawking"]]
        {
            :original-parts full-name
            :named-parts {
                :first first-name
                :last last-name
            }
        }))
