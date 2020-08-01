package tddbc;


public class ClosedRange {
    private int lowerEndpoint;
    private int upperEndpoint;

    public ClosedRange(int lowerEndpoint, int upperEndPoint) {
        this.lowerEndpoint = lowerEndpoint;
        this.upperEndpoint = upperEndPoint;
    }

    public String getRange() {
        return String.format("[%d,%d]",this.lowerEndpoint,this.upperEndpoint);
    }

    public boolean include(int point) {
        return ((this.lowerEndpoint <= point) && (point <= this.upperEndpoint));
    }

    public int getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public int getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean equals(ClosedRange it){
        return (this.lowerEndpoint == it.getLowerEndpoint()) && (this.upperEndpoint == it.getUpperEndpoint());
    }

}
