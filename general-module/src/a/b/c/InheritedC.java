package a.b.c;

public class InheritedC extends C {
    void display(){
        System.out.println(this.defaultVariable);
        System.out.println(this.protectedVariable);
        System.out.println(this.publicVariable);
    }
}
