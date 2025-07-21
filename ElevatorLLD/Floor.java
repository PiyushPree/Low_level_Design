public class Floor {
    int floorNo;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorNo) {
        this.floorNo = floorNo;
        externalDispatcher = new ExternalDispatcher();
    }

    public void pressButton(Direction direction) {
        externalDispatcher.submitExternalRequest(floorNo, direction);
    }
}
