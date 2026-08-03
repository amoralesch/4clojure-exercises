;; sequence-comprehensions-4

;; Difficulty: Basic
;; Topics: comprehensions

;; More complex transformations simply take multiple binding forms

;; (= [[:top :left] [:top :middle] [:top :right] [:middle :left] [:middle :middle] [:middle :right] [:bottom :left] [:bottom :middle] [:bottom :right]] (for [row [:top :middle :bottom] column [:left :middle :right]] __))

(= [
    [:top :left]
    [:top :middle]
    [:top :right]
    [:middle :left]
    [:middle :middle]
    [:middle :right]
    [:bottom :left]
    [:bottom :middle]
    [:bottom :right]]
   (for [row [:top :middle :bottom] column [:left :middle :right]]
        [row column]))
