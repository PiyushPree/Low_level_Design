public class ElevatorCar {
    int id;
    ElevatorDisplay display;
    InternalButtons internalButtons;
    ElevatorState elevatorState;
    int curFloor;
    Direction direction;

    public ElevatorCar() {
        display = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        elevatorState = ElevatorState.Ideal;
        curFloor = 0;
        direction = Direction.up;
    }

    public void showDisplay() {
        display.showDisplay();
    }

    public void pressButton(int destination) {
        internalButtons.pressButton(destination, this);
    }

    public void setDisplay() {
        this.display.setDisplay(curFloor, direction);
    }

    public boolean moveElevator(Direction dir, int destinationFloor) {
        int startFloor = curFloor;
        elevatorState = ElevatorState.Moving;
        direction = dir;

        if (dir == Direction.up) {
            for (int i = startFloor + 1; i <= destinationFloor; i++) {
                curFloor = i;
                setDisplay();
                showDisplay();
            }
        } else {
            for (int i = startFloor - 1; i >= destinationFloor; i--) {
                curFloor = i;
                setDisplay();
                showDisplay();
            }
        }

        elevatorState = ElevatorState.Ideal;
        return true;
    }
}
