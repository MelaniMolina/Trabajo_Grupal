import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mamiferos m = new Mamiferos();

        System.out.println("Nombre del animal: " + m.getNombre_ani());
        System.out.println("Se alimenta de: " + m.getAlimenta());
    }
}