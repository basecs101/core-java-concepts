package a.b.c;

public class AnotherC {
    public static void main(String[] args) {
        C objectCInsideSamePkg = new C();
        objectCInsideSamePkg.defaultVariable = 20;
//        objectCInsideSamePkg.privateVariableC = 30; not allowed
        objectCInsideSamePkg.protectedVariable =40;
        objectCInsideSamePkg.publicVariable = 100;
    }
}
