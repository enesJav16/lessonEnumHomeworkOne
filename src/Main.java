//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double distance=30;
        for(Transport transport:Transport.values()){
            System.out.println(transport);
            System.out.println("Cost per "+distance+" km is "+transport.calculateTravelCost(distance)+"$");
        }
    }
}