package switchtest;

public class Switch {
    public void print(){
        String marks = "A";
        switch ( marks) {
            case  "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("good");
                break;
            default:
                System.out.println("this is not good marks");
        }
    }

}
