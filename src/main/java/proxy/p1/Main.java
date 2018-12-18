package proxy.p1;


public class Main {
    public static void main(String[] args) {
        Examable s = new Student();
        s.exam();
        Examable t = new Cheater(s);
        t.exam();
    }
}
