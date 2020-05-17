import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type the name of the Football player: ");
        String name = input.next( );
        try {
            System.out.println("Please type your player's position from the followings: Goalkeeper, Defender, Midfielder, Striker ");
            Positions position = Positions.valueOf(input.next());
            System.out.println("Please type the category of your player from the followings: Gold, Silver, Bronze ");
            Category category = Category.valueOf(input.next());
            Creation.createCharacter(name, position, category);
        } catch (Exception e) {
            System.out.println("Please select from the available selection!");
            System.out.println("The application restart");
            restart(args);
        }
    }

    private static void restart(String[] strArr)
    {
        main(strArr);
    }
}
