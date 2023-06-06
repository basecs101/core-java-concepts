package a.b;

import a.b.c.C;

public class B extends C {
    int b;

    void display(){
        System.out.println(this.protectedVariable);

//        System.out.println(this.privateVariable);
//        System.out.println(this.defaultVariable);
    }

    public static void main(String[] args) {
        C objCinBClass = new C();
//        objCinBClass.defaultVariable = 30;
        objCinBClass.publicVariable = 2000;

    }
}
