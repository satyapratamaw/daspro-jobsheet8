import java.util.Scanner;
public class ModifikasiRectangle26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan jumlah kolom :");
        int kolom = sc.nextInt();
        System.out.print("Masukkan jumlah baris :");
        int baris = sc.nextInt();

    for (int i = 1; i <= baris; i++){ //outer loop
        for(int j = 1; j <= kolom; j++){ //inner loop
            System.out.print("#");
    }
    System.out.println(); //pindah baris
        }
        sc.close();
    }
}
