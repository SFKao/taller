import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Persona a,b;
        Coche c,d;

        String aux1,aux2,aux3,aux4;

        System.out.println("Introduce Nombre de 1a persona");
        aux1 = in.nextLine();
        System.out.println("Introduce Apellidos de la 1a persona");
        aux2 = in.nextLine();
        System.out.println("Introduce DNI de la 1a persona");
        aux3 = in.nextLine();
        a = new Persona(aux1,aux2,aux3);
        System.out.println("Introduce matricula del 1er coche");
        aux1 = in.nextLine();
        System.out.println("Introduce modelo del 1er coche");
        aux2 = in.nextLine();
        System.out.println("Introduce cilindrada del 1er coche");
        aux3 = in.nextLine();
        c = new Coche(aux1,aux2,Double.parseDouble(aux3));

        a.setVehiculo(c);

        System.out.println(a);
        System.out.println(c);

        System.out.println("Introduce Nombre de 2a persona");
        aux1 = in.nextLine();
        System.out.println("Introduce Apellidos de la 2a persona");
        aux2 = in.nextLine();
        System.out.println("Introduce DNI de la 2a persona");
        aux3 = in.nextLine();
        b = new Persona(aux1,aux2,aux3);
        System.out.println("Introduce matricula del 2er coche");
        aux1 = in.nextLine();
        System.out.println("Introduce modelo del 2er coche");
        aux2 = in.nextLine();
        System.out.println("Introduce cilindrada del 2er coche");
        aux3 = in.nextLine();
        d = new Coche(aux1,aux2,Double.parseDouble(aux3),b);

        System.out.println(b);
        System.out.println(d);

        System.out.println("Coche de a preventa: " + c);
        a.vendeCoche(b);
        System.out.println("Coche de a tras venta: " + c);
    }
}
