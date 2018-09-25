(ns my-app.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Its you"))

(defn factorial [n]
  (if (= n 0)1
    (* n (factorial (dec n)))
  )
)
