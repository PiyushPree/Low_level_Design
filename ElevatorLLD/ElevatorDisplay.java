public class ElevatorDisplay {
    private int floor;
    private Direction direction;

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay() {
        System.out.println("Elevator at floor: " + floor + " | Direction: " + direction);
    }
}
