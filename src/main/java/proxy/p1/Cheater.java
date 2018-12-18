package proxy.p1;

public class Cheater implements Examable {

    public Examable student;

    public Cheater() {
    }

    public Cheater(Examable student){
        this.student =  student;
    }

    @Override
    public void exam() {
        System.out.println("哈哈哈");
        student.exam();
    }
}
