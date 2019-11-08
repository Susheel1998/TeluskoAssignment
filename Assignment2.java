import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 65;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print((char)(a+j) +" ");
            }
            System.out.println();
        }
    }
}
