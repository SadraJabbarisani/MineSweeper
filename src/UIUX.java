import MineSweeper.Cell;

public class UIUX {

    public UIUX (){
        //System.out.println('\u000C');

    }

    public void welcome (){
        //System.out.print("\u000c");
        System.out.println("+------------------------------------+");
        System.out.println("|                                    |");
        System.out.println("|           !Mine Sweeper!           |");
        System.out.println("|                                    |");
        System.out.println("+------------------------------------+");
        System.out.println("| Welcome to Mine Sweeper💣!         |");
        System.out.println("| Choose one of the option below:    |");
        System.out.println("|                                    |");
        System.out.println("|            1.Play                  |");
        System.out.println("|            2.About game            |");
        System.out.println("|            3.Exit                  |");
        System.out.println("|                                    |");
        System.out.println("+------------------------------------+");
        System.out.println("|      WWW.SADRAJABBARISANI.COM      |");
        System.out.println("+------------------------------------+");
    }

    public void showGameEasy(Cell[][] cell){
        System.out.println("+--------------------------------+");
        System.out.println("|                                |");
        System.out.println("|         !Mine Sweeper!         |");
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");
        System.out.println("|    j                           |");
        System.out.println("|  i =  1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣    |");
        System.out.println("|      -----------------------   |");
        for(int row = 0; row<9; row++){
            System.out.print("|    "+ (row+1) +"| ");
            for(int col = 0; col < 9; col++){
                if (cell[row][col].cellState() == 'N'){
                    switch (cell[row][col].bombAround){
                        case 1:
                            System.out.print("1️⃣");
                            break;
                        case 2:
                            System.out.print("2️⃣");
                            break;
                        case 3:
                            System.out.print("3️⃣");
                            break;
                        case 4:
                            System.out.print("4️⃣");
                            break;
                        case 5:
                            System.out.print("5️⃣");
                            break;
                        case 6:
                            System.out.print("6️⃣");
                            break;
                        case 7:
                            System.out.print("7️⃣");
                            break;
                        case 8:
                            System.out.print("8️⃣");
                            break;
                        case 9:
                            System.out.print("9️⃣");
                            break;
                    }
                }
                else {
                    switch (cell[row][col].cellState())
                    {
                        case 'F':
                            System.out.print("🚩");
                            break;
                        case 'H':
                            System.out.print("⬜");
                            break;
                        case 'B':
                            System.out.print("💣");
                            break;
                        case 'X':
                            System.out.print("💥");
                            break;
                        case 'E':
                            System.out.print("🔳");
                            break;
                    }
                }
            }
            System.out.println("    |");
        }
        System.out.println("|                                |");
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");
        System.out.println("|    WWW.SADRAJABBARISANI.COM    |");
        System.out.println("+--------------------------------+");

    }
}