public class Ifelse {
    public static void main(String args[]){
        int a = 7;
        int b = 9;
        int c = 17;
        if(a>b && a>c){
            System.out.println("a is greatest among all number");
        }
        else if(b>a && b>c){
             System.out.println("b is greatest among all number");
        }
        else{
            System.out.println("c is greatest among all number");
        }
    }
}
