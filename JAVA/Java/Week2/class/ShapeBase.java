package Week2;

// provide the template, also caleed superclass, never be used
public abstract class ShapeBase{
    abstract void draw();
    abstract void erase();

    final void print(){
        System.out.println("a shape");
    }
}