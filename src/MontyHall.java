import java.util.ArrayList;
import java.util.List;

public class MontyHall {
    private final int car;
    private int selectedDoor;
    private int hintDoor;

    //Constructor that initialize that door with prize
    public MontyHall() {
        car = (int) (Math.random() * 3) + 1;
    }

    //Necessary getters and setters for some of the variables
    public int getHintDoor() {
        return hintDoor;
    }

    public void setSelectedDoor(int playerChoice) {
        selectedDoor = playerChoice;
    }

    //Displays a door that is not the player choice or the one with the car
    public void showDoor() {
        List<Integer> doors = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (i != car && i != selectedDoor - 1) {
                doors.add(i);
            }
        }
        int randomDoor = (int) (Math.random() * doors.size());
        hintDoor = doors.get(randomDoor);
    }

    //Switches the user's choice to the other door not already chosen
    public int switchDoor() {
        selectedDoor = 3 - selectedDoor - hintDoor;
        return selectedDoor;
    }

    //Checks if the selected door has car
    public String checkWin() {
        if (selectedDoor == car) {
            return "You won the car!";
        }
        return "The car is behind door " + car + ". You lost!";
    }
}
