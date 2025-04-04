import java.util.Scanner;
public class ifelse 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of s1:");
        int a = sc.nextInt();
        System.out.println("enter marks of s2:");
        int b = sc.nextInt();
        System.out.println("enter marks of s3:");
        int c =sc.nextInt();
        int sum = (a+b+c);
        double per = (sum*100)/300;
        if(per==50.00)
        {
            System.out.println("pass");
        }
            else if(per>50.00)
            {
                System.out.println("A");
            }
            else
            {
                System.out.println("fail");
            }
        }
    }

