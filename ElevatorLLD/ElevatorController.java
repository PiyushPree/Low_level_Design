import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> b - a);
    }

    public void submitExternlRequest(int floor, Direction direction) {
        if (direction == Direction.down) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
    }

    public void submitInternlRequest(int floor) {
        if (floor > elevatorCar.curFloor) {
            upMinPQ.offer(floor);
        } else {
            downMaxPQ.offer(floor);
        }
    }

    public void controlElevator() {
        while (!upMinPQ.isEmpty() || !downMaxPQ.isEmpty()) {
            while (!upMinPQ.isEmpty()) {
                int floor = upMinPQ.poll();
                elevatorCar.moveElevator(Direction.up, floor);
            }

            while (!downMaxPQ.isEmpty()) {
                int floor = downMaxPQ.poll();
                elevatorCar.moveElevator(Direction.down, floor);
            }
        }
    }
}
