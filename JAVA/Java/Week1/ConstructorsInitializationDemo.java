public class ConstructorsInitializationDemo {
    
    int x;
    char c;
    ChainingDemo demo;
    // Constructor function (same name with class)
    public ConstructorsInitializationDemo(){
        x = 5;
        c = 'A';
        demo = new ChainingDemo();
    }

    public ConstructorsInitializationDemo(int x){
        this.x = x;

    }

    public ConstructorsInitializationDemo(ChainingDemo demo){
        this.demo = demo;
    }


    public static void main(String[] args) {
        
    }
}
