import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil%4==0){
            System.out.println("Artık Yıldır!");
        }else {
            System.out.println("Artık Yıl Değildir! ");
        }
    }
}
