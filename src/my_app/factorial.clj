(defn factorial-bigint [n]
"This is just a function to show the use of functions"
(if (= 0 n)1
        (loop [val n i n]
            (if (<= i 1)val
                (recur (*' val (dec i)) (dec i))
            )
        )
    )
)