import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nombre,edad,peso");
        String name= scan.nextLine();
        int edad= scan.nextInt();
        float peso= scan.nextFloat();
        Gallina random =new Gallina();
        Gallina gallina=new Gallina();
        Gallina gallina1=new Gallina(name,edad,peso);
        gallina.mostrarInfo();
        gallina1.mostrarInfo();
        random.mostrarInfo();
    }
}