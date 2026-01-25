import java.util.*;

public class Marks {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter marks: ");
            int n = sc.nextInt();

            if(n>=90 && n<=100){
                System.out.println("Excelent");
            } 
            else if(n>=60 && n<=89){
                System.out.println("Good");
            }
            else if(n>=40 && n<=59){
                System.out.println("Average");
            }
            else{
                System.out.println("Fail");
            }
        }
    }
}
