package automation;

public class IfThenElse_Q3 {
    public static void main(String[] args) {
        IfThenElse_Q3 obj =new IfThenElse_Q3();
        obj.isTeen(21);
    }public boolean isTeen(int age){
        if (age<=18){
            System.out.println(age + " true");
        }else{
            System.out.println(age + " false");
        }
        return false;
    }
}
