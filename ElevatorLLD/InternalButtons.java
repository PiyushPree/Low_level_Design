public class InternalButtons {
    InternalDispatcher dispatcher = new InternalDispatcher();

    public void pressButton(int destination, ElevatorCar elevatorCar) {
        dispatcher.submitInternalRequest(destination, elevatorCar);
    }
}
