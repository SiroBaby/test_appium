package corejava;

public class chillClassDemo extends parentClassdemo {

    public void engine () {
        System.out.println("new engine");
    }

    public void color () {
        System.out.println(color);
    }

    public static void main(String[] args) {
        chillClassDemo cd = new chillClassDemo();

        cd.color();
        cd.Brakes();
    }
}
