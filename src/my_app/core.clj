(ns my-app.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Its you"))
;;Since there are no loops we will devise a new way to loop
(defn fizz-buzz [j]
    (loop [i j]
    (if (<= j 100)
        (do
           (if (and (= (rem i 3) 0)(= (rem i 5) 0))
                (print "FizzBuzz")
                (if (= (rem i 3) 0)
                     (print "Fizz")
                     (if (= (rem i 5) 0)
                        (print "Buzz")
                     ))
                 )
           )
    )
        (recur (inc i)))
    )
