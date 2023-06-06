package a.b.c;

public class C {
    private int privateVariable;//accessible within class only

    int defaultVariable;//package private or c is accessible inside package only or the classes of same package.
    protected int protectedVariable;//accessible within package and outside package using inheritance

    public int publicVariable;
}
