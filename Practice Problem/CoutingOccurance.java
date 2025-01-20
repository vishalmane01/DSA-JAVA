import java.util.Scanner;
public class CoutingOccurance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();

        System.out.print("Enter a character to be counter: ");
        char ch = sc.next().trim().charAt(0);
        
        int count = 0;
        for(int i = 0; i<=str.length()-1;i++){
            if(str.charAt(i) == ch){
                count++;
            }else{
                continue;
            }
        }
        System.out.print("The character "+ch+" occurs "+count+" times in the given string.");
    }
}