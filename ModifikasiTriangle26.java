import java.util.Scanner;
public class ModifikasiTriangle26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= n) {
            int j = 0;
            while (j < i){
                System.out.print("*");
                j++;
            }
            
            i++;
        }
        i = n;
        while(i >= 1) {
            int k = 0;
            while (k < i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}