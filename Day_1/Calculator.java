import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        int ch;
        int a,b,c;
        
        Scanner sc =new Scanner(System.in);
        while(true){
        System.out.println(":::Welcome to our Calculator:::"+"\n"+"1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division\n 5.Exit");
        ch = sc.nextInt();
        switch (ch) {
            
            case 1:
                System.out.println(":::Addition:::");
                System.out.print("a=");
                a = sc.nextInt();
                System.out.print("b=");
                b= sc.nextInt();
                c = a+b;
                System.out.println("Addition is ="+c);
                break;
            case 2:
                System.out.println(":::Substraction:::");
                System.out.print("a=");
                a = sc.nextInt();
                System.out.print("b=");
                b= sc.nextInt();
                c = a-b;
                System.out.println("Substraction is ="+c);
                break;
            case 3:
                System.out.println(":::Multiplication:::");
                System.out.print("a=");
                a = sc.nextInt();
                System.out.print("b=");
                b= sc.nextInt();
                c = a*b;
                System.out.println("Multiplication is ="+c);
                break;
            case 4:
                System.out.println(":::Division:::");
                System.out.print("a=");
                a = sc.nextInt();
                System.out.print("b=");
                b= sc.nextInt();
                float d = (float)a/b;
                System.out.println("Division is ="+d);
                break;
            case 5:
                System.out.println(":::Exiting:::");
                return;
            default:
                System.out.println("Invalid choice");
        
    }
    }
}

}
