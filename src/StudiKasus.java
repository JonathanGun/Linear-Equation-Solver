import java.util.Scanner;

public class StudiKasus {
	static Scanner input = new Scanner(System.in);
    static Matrix m = new Matrix(0, 0);

    private static void menu(){
    	System.out.println("$ Pilihan Menu Studi Kasus $");
        System.out.println("0. Lihat matriks tersimpan");
        System.out.println("1. Kasus Ax = b");
        System.out.println("2. Kasus Matriks Augmented");
        System.out.println("3. Kasus SPL");
        System.out.println("4. Determinan, Kofaktor, danInvers Matriks Bujur Sangkar");
        System.out.println("5. Mencari Arus dan Tegangan Rangkaian Listrik");
        System.out.println("6. Prediksi Jumlah Penduduk Jawa Barat");
        System.out.println("7. Prediksi fungsi f(x) transenden");
        System.out.println("8. Keluar");
        System.out.println("Apa yang ingin Anda lakukan?");

        int choice = input.nextInt();
        char x;
        switch(choice){
            case 0: 
                m.showMatrix();
                break;
            case 1:
            	x = input.next().charAt(0);
                solve1(x); // splInv
                break;
            case 2:
            	x = input.next().charAt(0);
                solve2(x); // splGauss
                break;
            case 3:
            	x = input.next().charAt(0);
                solve3(x); // splGaussJordan
                break;
            case 4:
            	x = input.next().charAt(0);
                solve4(x); // matriksKotak
                break;
            case 5:
                solve5(); // interpolasiRangkaian
                break;
            case 6:
                solve6(); // interpolasiPenduduk
                break;
            case 7:
                solve7(); // interpolasiFungsi
                break;
            case 8:
            	break;
            default:
                System.out.println("Input tidak valid. Silakan ulangi!");
                System.out.println("Apa yang ingin Anda lakukan?");
                choice = input.nextInt();
        }
        if(choice == 8) System.out.println("Terima kasih!");
        else menu();
    }

    private static void solve1(char x){
        if (x <= 'c'){
            try{
                m.inputMatrixFromFile("/StudiKasus/1"+x+".txt", false);
            } catch (Exception e){
                e.printStackTrace();
            }
            m.splInv();
        } else {
            System.out.print("Masukkan nilai n: ");
            int n = input.nextInt();
            m = m.matriksHilbert(n);
            m.splGauss();
        }
    }

    private static void solve2(char x){
        switch(x){
            case 'a':

            case 'b':

        }
    }

    private static void solve3(char x){
        switch(x){
            case 'a':

            case 'b':

        }
    }

    private static void solve4(char x){
        switch(x){
            case 'a': // 5x5, ada pilihan invers, deter, dll

            case 'b': // 10x10

        }
    }

    private static void solve5(){
        // rangkaian
    }

    private static void solve6(){
        // penduduk
        int tahun = input.nextInt();
    }

    private static void solve7(){
        int n = input.nextInt();  
    }

    public static void main(String[] args){
        menu();
    }
}