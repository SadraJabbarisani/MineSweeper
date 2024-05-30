package MineSweeper;

import java.util.Random;

//::::::::::::::::::::::::::::::::::::GAME:::::::::::::::::::::::::::::::::::::::::
public class Game {
    Random random = new Random();
    int j, i, bombNumber;
    public Cell[][] cell;

    //----------------------------------------
    public Game(String difficulty){
        switch (difficulty){
            case "Easy":
                i = j = 9;
                bombNumber = 10;
                break;
            case "Medium":
                i = j = 18;
                bombNumber = 40;
                break;
            case "Hard":
                i = j = 60;
                bombNumber = 99;
                break;
            case "JustLikeLivingInIran":
                i = j = 70;
                bombNumber = 127;
                break;
        }
        cell = new Cell[j][i];
        cellMaker();
        tableMaker();
    }

    public void visibleAll (){
        for (int row = 0 ; row < j ; row++){
            for (int col = 0; col < i; col++){
                cell[row][col].hide = false;
            }
        }
    }

    private void cellMaker(){
        for (int row = 0 ; row < j ; row++){
            for (int col = 0; col < i; col++){
                cell[row][col] = new Cell();
            }
        }
    }

    private void putNumber (int row, int col){
        int rowStart, rowEnd, colStart, colEnd;

        rowStart = row - 1;
        rowEnd = row + 1;

        colStart = col - 1;
        colEnd = col + 1;

        if(row == 0)
            rowStart = row;
        if(row == j-1)
            rowEnd = row;
        if(col == 0)
            colStart = col;
        if(col == i-1)
            colEnd = col;

        for(int subRow = rowStart; subRow <= rowEnd; subRow++){
            for(int subCol = colStart; subCol <= colEnd; subCol++){
                if(cell[subRow][subCol].bomb){
                    cell[row][col].bombAround++;
                }
            }
        }
    }

    private void tableMaker (){
        int row, col, bombCounter = 0;
        while (bombCounter < bombNumber){
            row = random.nextInt(j);
            col = random.nextInt(i);
            if(!cell[row][col].bomb) {
                cell[row][col].plantBomb();
                bombCounter++;
            }
        }

        for(row = 0; row < j; row++){
            for(col = 0; col < i; col++){
                if(!cell[row][col].bomb){
                    putNumber(row,col);
                }
            }
        }
    }

    public boolean click (int row, int col){
        if(cell[row][col].flag || cell[row][col].cellState() == 'E'){
            return false;
        }
        else if (cell[row][col].bomb) {
            cell[row][col].explosion = true;
            visibleAll();
            return true;
        }
        else {
            unHider(row,col);
            return true;
        }

    }

    private void unHider(int row, int col){

        cell[row][col].hide = false;

        int rowStart, rowEnd, colStart, colEnd;

        rowStart = row - 1;
        rowEnd = row + 1;

        colStart = col - 1;
        colEnd = col + 1;

        if(row == 0)
            rowStart = row;
        if(row == j-1)
            rowEnd = row;
        if(col == 0)
            colStart = col;
        if(col == i-1)
            colEnd = col;

        if (cell[row][col].bombAround > 0 ) {
            return;
        }
        if(cell[row][col].cellState() == 'E')
        {
            for(int subRow = rowStart; subRow <= rowEnd; subRow++){
                for(int subCol = colStart; subCol <= colEnd; subCol++){
                    if(cell[subRow][subCol].cellState() == 'H')
                        unHider(subRow,subCol);
                }
            }
        }
        //return true;
    }
}
