public enum Transport {

    CAR(0.1),
    BUS(0.02),
    TRUCK(0.05);

    private double cost;
    Transport(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public  double calculateTravelCost(double distance){
        for (int i = 0; i < Transport.values().length; i++) {
            return cost*distance;
        }
        return 0;

    };

    @Override
    public String toString() {
        return "Transport: " + super.toString()+
                " cost per km " + cost +"$";
    }
}
