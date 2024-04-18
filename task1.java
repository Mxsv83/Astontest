import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите значение а=");
        int a = scan.nextInt();
        System.out.print("введите значение b=");
        int b =scan.nextInt();

        if( a>b)
        {
            System.out.println("a>b");
        }
        if (a<b){
            System.out.println("a<b");
        }
        if (a == b) {
            System.out.println("a=b");
        }


        int res1 = a+b;
        int res2 = a-b;
        int res3 = a*b;
        int res4 = a/b;

        System.out.println(res1 + "\n"+ res2 +"\n"+ res3 +"\n" + res4);

    }
}