interface Constants {
    int MIN = 1;
    int MAX = 10;
}

class Demo implements Constants {
    public void showLimits() {
        System.out.println("Min: " + MIN);
        System.out.println("Max: " + MAX);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.showLimits();
    }
}
