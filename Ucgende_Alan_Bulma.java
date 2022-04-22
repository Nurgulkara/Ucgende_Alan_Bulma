import java.util.Scanner;
public class Ucgende_Alan_Bulma {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        int a, b, c, u, alan, cevre;
        System.out.print("a uzunlugunu giriniz: ");
        a= inp.nextInt();
        System.out.print("b uzunlugunu giriniz: ");
        b= inp.nextInt();
        System.out.print("c uzunlugunu giriniz: ");
        c= inp.nextInt();

        cevre= (a + b+ c);
        u= (a + b + c)/ 2;

        alan = (u * (u - a) * (u - b) * (u - c)^2) ;


        System.out.println("Ucgenin Cevresi: " + cevre);
        System.out.print("Ucgenin Alani: " + alan);

    }
}
