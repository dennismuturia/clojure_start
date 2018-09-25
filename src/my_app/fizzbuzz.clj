;;This is a simple fizzbuzz applicatiion in clojure. Previously written in Nightcode. The wrong way
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
;; We will use macros to make things easier
(defn fizz-buzz-cond [k]
    ;;Make the loop start at one
    (loop [i 1]
        (if (<= i k)
            ;; Initialize a do
            (do
            ;; Cond is like a if statement condotion to replace a dozen if statements
                (cond
                    (and (= (rem i 3) 0) (= (rem i 5) 0)) (println "FizzBuzz")
                    (= (rem i 3) 0)(println "Fizz")
                    (= (rem i 5) 0)(println "Buzz")
                )
                (recur (inc i))
            )
        )
    )
)