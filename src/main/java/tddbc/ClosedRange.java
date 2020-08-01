package tddbc;


public class ClosedRange {
    private int lowerEndpoint;
    private int upperEndpoint;

    public ClosedRange(int lowerEndpoint, int upperEndPoint) {
        this.lowerEndpoint = lowerEndpoint;
        this.upperEndpoint = upperEndPoint;
    }

    public String getRange() {
        return "[" + this.lowerEndpoint + "," + this.upperEndpoint+ "]";
    }

}
