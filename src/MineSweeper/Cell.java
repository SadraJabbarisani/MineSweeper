package MineSweeper;

//::::::::::::::::::::::::::::::::::::CELL:::::::::::::::::::::::::::::::::::::::::
public class Cell {
    boolean bomb, flag, hide, explosion;
    public byte bombAround;
    //----------------------------------------
    public Cell(){
        flag = false;
        hide = true;
    }

    public void numPluser(){
        bombAround++;
    }

    public void plantBomb(){
        bomb = true;
        bombAround = 0;
    }

    public char cellState(){
        if (flag)
            return 'F';
        else if (hide)
            return 'H';
        else if (explosion)
            return 'X';
        else if (bomb)
            return 'B';
        else if (bombAround > 0)
            return 'N';
        else{
            return 'E';
        }
    }
}