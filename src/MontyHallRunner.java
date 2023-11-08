import java.util.Scanner;

public class MontyHallRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Monty Hall Game!\n");
        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");

        MontyHall montyHallGame = new MontyHall();

        System.out.print("Where do you think the car is? Enter 1, 2, or 3: ");
        int userChoice = scan.nextInt();
        montyHallGame.setSelectedDoor(userChoice);
        scan.nextLine();

        montyHallGame.showDoor();
        System.out.println("One of the goats is behind door number " + montyHallGame.getHintDoor());


        System.out.print("Do you want to switch your guess? Yes or No?: ");
        String switchChoice = scan.nextLine();
        if (switchChoice.equals("Yes")) {
            int newDoor = montyHallGame.switchDoor();
            System.out.println("Guess switch from " + userChoice + " to " + newDoor + ".");
        }

        System.out.print(montyHallGame.checkWin());
    }
}