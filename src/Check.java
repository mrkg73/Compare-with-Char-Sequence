import java.util.Scanner;

public class Check

{

    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first text please: ");
        String text1=sc.nextLine()  ;
        System.out.println("Enter the second text please: ");
        String text2=sc.nextLine()  ;

        System.out.println(((text1.contentEquals(text2)?"both text are same":"The texts are different")));

    }

}
