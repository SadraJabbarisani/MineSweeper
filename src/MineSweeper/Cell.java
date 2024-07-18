package MineSweeper;

//::::::::::::::::::::::::::::::::::::CELL:::::::::::::::::::::::::::::::::::::::::
public class Cell {
    boolean bomb, flag, hide, explosion;
    public int bombAround;
    //----------------------------------------
    public Cell(){
        flag = false;
        hide = true;
    }

    public void plantBomb(){
        bomb = true;
        bombAround = 0;
    }

    public cellState cellState(){
        if (flag)
            return cellState.Flag;
        else if (hide)
            return cellState.Hide;
        else if (explosion)
            return cellState.Explosion;
        else if (bomb)
            return cellState.Bomb;
        else if (bombAround > 0)
            return cellState.Number;
        else{
            return cellState.Empty;
        }
    }
}