import java.util.Scanner;  
class sc
{
    public static void main(String[] args)
    {
        System.out.print("***Before Swapping***\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("The value of a is:");
        int a=sc.nextInt();
        System.out.print("The value of b is:");
        int b=sc.nextInt();
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.print("***After Swapping***\n");
        System.out.print("The value of a is:"+a);
        System.out.print("\nThe value of b is:"+b);



    }
}
