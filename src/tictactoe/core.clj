(ns tictactoe.core)

(defn identifica1 [lista] 
  (if (= (first lista) 'x)
                  (if (= (last lista) 'x)
                  ['x 'o 'x]
                  ['x 'x 'o]
                  )lista)
                    
    )

(defn tic-tac-toe 
  [jogo simbolo]
  (map identifica1 jogo)
)
