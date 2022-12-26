import java.util.Scanner;
public class recursiveFibonacci {
    static int fib(int x){
        if (x==1 || x == 2){
            return 1;
        }
        return fib(x-1)+fib(x-2);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol Edilecek Sayı:");
        n=input.nextInt();
        System.out.print(fib(n));
    }
}
