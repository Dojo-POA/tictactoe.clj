(ns tictactoe.core-test
  (:require [clojure.test :refer :all]
            [tictactoe.core :refer :all]))

(def jogo [['x,'x,'_],
           ['o,'_,'_],
           ['_,'_,'_]])

(def jogo-2 [['o,'_,'_],
             ['x,'x,'_],
             ['_,'_,'_]])

(def jogo-3 [['o,'_,'_],
             ['x,'_,'x],
             ['_,'_,'o]])

(deftest should-not-lose
  (testing "should not lose"
    (is (= (tic-tac-toe jogo 'o) [['x,'x,'o],
                                  ['o,'_,'_],
                                  ['_,'_,'_]])))

  (testing "should not lose o"
    (is (= (tic-tac-toe jogo-2 'o) [['o,'_,'_],
                                    ['x,'x,'o],
                                    ['_,'_,'_]]
           )))

  (testing "should not lose x-o"
    (is (= (tic-tac-toe jogo-3 'o) [['o,'_,'_],
                                    ['x,'o,'x],
                                    ['_,'_,'x]]
           ))))

(run-tests 'tictactoe.core-test)