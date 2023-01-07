
enum Seasons {
    WINTER("I love winter"), // public static final Seasons WINTER = new Seasons("I love winter");
    SUMMER("I hate summer"), // public static final Seasons SUMMER = new Seasons("I hate summer");
    MONSOON("Monsoon is okay"); // public static final Seasons MONSOON = new Seasons("Monsoon is okay");
    String msg;

    private Seasons(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (Seasons season : Seasons.values()){
            Thread.sleep(1000);
            System.out.println(season.name() + " "+ season.msg);
        }

    }
}