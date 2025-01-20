import java.util.Scanner;
public class casecheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character:");
        char ch = sc.next().trim().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Input character is in Uppercase");
        }else{
            System.out.println("Input charachet is in Lowercase");
        }
    }
}
