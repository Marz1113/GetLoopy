import java.util.Random;
import java.util.Scanner;

public class DieRoller {

    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);

        int die1 = 0;
        int die2 = -1;
        int die3 = -2;
        int dieRoller = 0;
        int roll = 0;
        String input = "y";

        System.out.println("roll#\tdie1\tdie2\tdie3\tdieRoller");
        System.out.println("-------------------------");

        while (die1 != die2 || die2 != die3) {
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoller = die1 + die2 + die3;
            roll++;
            System.out.printf("%3d%8d%8d%8d%9d\n", roll, die1, die2, die3, dieRoller);

            if (die1 == die2 && die2 == +die3) {
                System.out.println("you rolled three of the same kind! Game over.");
                break;
            }


            System.out.print("would you like to keep rolling? (Y/N): ");
            input = scanner.nextLine();


            if (!input.equalsIgnoreCase("Y")) {
                System.out.println("game done.");
                break;
            }
        }
    }
}
