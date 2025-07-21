import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Floor> floorList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            floorList.add(new Floor(i));
        }

        Building building = new Building(floorList);

        // Simulate user on floor 3 presses UP button
        building.getAllFloorList().get(2).pressButton(Direction.up);

        // Simulate a person inside elevator presses floor 5
        ElevatorController controller = ElevatorCreator.elevatorControllerList.get(0);
        controller.elevatorCar.pressButton(5);
    }
}
