public class PassingDataTypesMethodDemo{
    // all Java script is passing by value not by reference
    public static void main(String[] args) {
        double d = 2.0;
        changeMe(d);
        System.out.printf("d = " + d+ '\n');

        Car lamborghini = new Car();
        lamborghini.setSpeed(65.0);
        changeCarParameter(lamborghini);
        System.out.printf("The Speed =  " + lamborghini.getSpeed() + '\n');
        changeCar(lamborghini);
        System.out.printf("The Speed =  " + lamborghini.getSpeed()+ '\n');
    }

    public static void changeMe(double d){
        d = 345.0;
    }
    public static void changeCarParameter(Car c){
        c.setSpeed(200);
    }
    public static void changeCar(Car c){
        Car ford = new Car();
        ford.setSpeed(75.0);
        c = ford;

    }

}