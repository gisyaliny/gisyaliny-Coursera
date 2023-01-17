public class Shape {
    void draw(){
        System.out.println("draw shape");
    }

    void erase(){}
//  final function can not be overwritted.
    final void print(){
        System.out.println("a shape");
    }
    
}
