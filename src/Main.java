import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            int opcion;

            do {
                System.out.println("Que ejercicio quieres ver");
                opcion = Integer.parseInt(in.nextLine());
            } while (opcion < 0 || opcion >= 7);

            switch (opcion) {
                case 0:
                    System.exit(0);
                case 1:
                    ej1();
                    break;
                case 2:
                    ej2();
                    break;
                case 3:
                    ej3();
                    break;
                case 4:
                    ej4();
                    break;


            }
        }
    }

    public static void ej1(){
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

    public static void ej2(){
        Persona2 a = new Persona2("Oscar", "Melero", 10);
        Herramienta b = new Herramienta("Motosierra",3);

        a.setHerramienta(b);

        System.out.println(a);
    }

    public static void ej3(){
        Persona3 p = new Persona3("Oscar","77432934F");
        for(int i = 0; i < 10; i++){
            p.insert(new Ordenadores(i,String.valueOf(i*i*i)));
        }
        System.out.println("Persona = " + p.toStringLoop());
        System.out.println("Primer ordenador de persona" + p.get(0).toStringLoop());
    }

    public static void ej4(){
        Persona4 p = new Persona4("Oscar","77432934F");
        for(int i = 0; i < 10; i++){
            p.insert(new Ordenador4(i,String.valueOf(i*i*i)));
            p.arreglar(0);
        }
        System.out.println("Persona = " + p.toStringLoop());
        //System.out.println("Primer ordenador de persona" + p.get(0).toStringLoop());
    }
}
