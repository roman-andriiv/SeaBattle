import java.util.Scanner;

public class Main {

    static  Scanner scanner = new Scanner(System.in);
    static final int FIELD_LENGTH = 10;

    public static void main(String[] args) {

        System.out.println("Player 1, please, input your name");
        String player1Name = scanner.nextLine();
        System.out.printf("Hello, %s!",player1Name);
        System.out.println();
        System.out.println();

        System.out.println("Player 2, please, input your name");
        String player2Name = scanner.nextLine();
        System.out.printf("Hello, %s!",player2Name);
        System.out.println();
        System.out.println();

        char[][] playerField1 = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerField2 = new char[FIELD_LENGTH][FIELD_LENGTH];

        char[][] playerBattleField1 = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerBattleField2 = new char[FIELD_LENGTH][FIELD_LENGTH];

        fillPlayerField(playerField1);
        fillPlayerField(playerField2);
    }
    private static void fillPlayerField(char[][] playerField){
        for (int i = 4; i >=1 ; i--) {
            for (int j = i; j <=5 ; j++) {
                System.out.println("We arrange a " + i + "-deck ship. It remains to arrange: " + (j + 1));

                System.out.println("Input x coordinate: ");
                int x = scanner.nextInt();

                System.out.println("Input y coordinate: ");
                int y = scanner.nextInt();

                System.out.println("1 - horizontal; 2 - vertical ?");
                int position = scanner.nextInt();

                if (position == 1){
                    for (int k = 0; k <i ; k++) {
                        playerField[y][x+k] = '1';
                    }
                }
                if (position==2){
                    for (int m = 0; m <i ; m++) {
                        playerField[y+m][x] = '1';
                    }
                }
                printField(playerField);
            }
        }
    }

    static void printField(char[][] field) {
        for (char[] cells : field) {
            for (char cell : cells) {
                if (cell == 0){
                    System.out.print(" |");
                }else {
                    System.out.print(cell+"|");
                }
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
}
