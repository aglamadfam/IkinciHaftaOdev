//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setAraba("Toyota","Corolla","Black",2008,300000, 15);
        car2.setAraba("BMW","M300","blue",2013,15000,25);

        System.out.println(car1.getBrand());

    }
}

