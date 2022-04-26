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

    }
}
