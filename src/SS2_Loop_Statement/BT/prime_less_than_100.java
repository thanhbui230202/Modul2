package SS2_Loop_Statement.BT;


import java.util.Scanner;

public class prime_less_than_100 {
    public static void main(String[] args) {
        int i,count;
        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime numbers between 2 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }
    }
    }
