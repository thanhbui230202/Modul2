package ss15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static int div() throws TriangleException{
        Scanner scanner = new Scanner(System.in);
        int a =0;
        int b=0;
        int c=0;
        try{
            System.out.println("Enter a:");
            a = scanner.nextInt();
            System.out.println("Enter b:");
            b = scanner.nextInt();
            System.out.println("Enter c:");
            c = scanner.nextInt();
            if ( a < 0 || b < 0 || c < 0){
                throw new TriangleException("Enter the number {a,b,c} than 0");
            }if (a+b < c){
                throw new TriangleException("Enter the number a+b < c");
            }if (b+c < a){
                throw new TriangleException("Enter the number b+c < a");
            }if (c+a < b){
                throw new TriangleException("Enter the number c+a < b");
            }
        }catch (InputMismatchException e) {
            System.out.println("Enter the number");

        }
        catch (TriangleException e){
            e.printStackTrace();
//          System.out.println("Enter the number than 0");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End program");
        }
        return 10;
    }

    public static void main(String[] args) throws TriangleException {
        System.out.println(div());
    }
}
