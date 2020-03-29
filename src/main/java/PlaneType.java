public enum PlaneType {

    BOEING747(1, 500000),
    BOEING777(365, 160120),;

    private final int capacity;
    private final int totalWeight;


    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
