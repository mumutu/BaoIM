/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.binding.NumberExpression;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author luye66
 */
public class ReversiModel {
    public static int BOARD_SIZE = 8;
    public ObjectProperty<Owner> turn = new SimpleObjectProperty<Owner>(Owner.BLACK);
    public ObjectProperty<Owner>[][] board = new ObjectProperty[BOARD_SIZE][BOARD_SIZE];
    
    private ReversiModel(){
        for(int i=0 ; i<BOARD_SIZE;i++)
        {
            for(int j=0;j<BOARD_SIZE;j++)
            {
                board[i][j] = new SimpleObjectProperty<Owner>(Owner.NONE);
            }
        }
        initBoard();
    }
    
    public static ReversiModel getInstance(){
        return ReversiModelHolder.INSTANCE;
    }
    
    private static class ReversiModelHolder{
        private static final ReversiModel INSTANCE = new ReversiModel();
    }
    
    private void initBoard(){
        int center1 = BOARD_SIZE/2-1;
        int center2 = BOARD_SIZE/2;
        
        board[center1][center1].setValue(Owner.WHITE);
        board[center1][center2].setValue(Owner.BLACK);
        board[center2][center1].setValue(Owner.BLACK);
        board[center2][center2].setValue(Owner.WHITE);
    }
    
     public NumberExpression getScore(Owner owner){
        NumberExpression score = new SimpleIntegerProperty();
        for(int i=0; i<BOARD_SIZE;i++){
            for(int j=0; j<BOARD_SIZE;j++){
                score = score.add(Bindings.when(board[i][j].isEqualTo(owner)).then(1).otherwise(0));
            }
        }
        return  score;
    }
     public NumberBinding getTurnsRemaining(Owner owner){
         NumberExpression emptyCellCount = getScore(Owner.NONE);
         
         return Bindings.when(turn.isEqualTo(owner))
                 .then(emptyCellCount.add(1).divide(2))
                 .otherwise(emptyCellCount.divide(2));
     }
}
