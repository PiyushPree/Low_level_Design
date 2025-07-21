import java.util.List;

public class ExternalDispatcher {
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitExternalRequest(int floor, Direction direction) {
        for (ElevatorController elevatorController : elevatorControllerList) {
            int elevatorID = elevatorController.elevatorCar.id;
            if (elevatorID % 2 == floor % 2) {
                elevatorController.submitExternlRequest(floor, direction);
            }
        }
    }
}
