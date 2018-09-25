;;This is a simple fizzbuzz applicatiion in clojure. Previously written in Nightcode
(defn fizz-buzz [j]
    (loop [i j]
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
        (recur (inc i)))
    )
)