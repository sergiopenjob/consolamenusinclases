package menusinclases;

import java.util.Scanner;

public class Main {

    static int menu = 0;
    static int desde = 0;
    static int hasta = 0;
    static Scanner scn = new Scanner(System.in);
    static final int SALIR_MENU = 3;
    static final int SALIR_FUNC = 0;

    public static void main(String[] args) {
        do {
            mostrarMenu();
            menu = scn.nextInt();
            ejecutarMenu(menu);
        } while (menu != SALIR_MENU);

        System.out.println("Hasta luego!");
    }

    public static void mostrarMenu() {
        limpiarPantalla();
        System.out.println("JAVA CONSOLA");
        System.out.println("1. Num Pares");
        System.out.println("2. Num Primo");
        System.out.println("3. Salir");
        System.out.println("Seleccione opcion [1-3] : ");
    }

    public static void ejecutarMenu(int menu) {
        int desde, hasta;
        Scanner scn = new Scanner(System.in);

        limpiarPantalla();

        switch (menu) {
            case 1:
                System.out.println("Escriba el numero de comienzo");
                desde = scn.nextInt();
                System.out.println("Escriba el numero de fin");
                hasta = scn.nextInt();

                numerosPares(desde, hasta);
                break;

            case 2:
                System.out.println("Escriba el numero de comienzo");
                desde = scn.nextInt();
                System.out.println("Escriba el numero de fin");
                hasta = scn.nextInt();

                numerosPrimos(desde, hasta);
                break;
        }
    }

    public static void limpiarPantalla() {
        for (int i = 0; i <= 25; i++) {
            System.out.println();
        }
    }

    public static void continuar() {
        Scanner scn = new Scanner(System.in);
        int continuar = 1;

        do {
            System.out.println("\n\nPulse 0 para continuar...");
            continuar = scn.nextInt();
        } while (continuar != SALIR_FUNC);

        limpiarPantalla();
    }

    public static boolean esPrimo(int valor) {
        int num = 2;
        boolean primo = true;

        while (primo && num < valor) {
            if (valor % num == 0) {
                primo = false;
            }

            num++;
        }

        return primo;
    }

    public static boolean esPar(int valor) {
        boolean par = false;

        if (valor % 2 == 0) {
            par = true;
        }

        return par;
    }

    public static void numerosPares(int desde, int hasta) {
        limpiarPantalla();
        System.out.println("Numeros pares desde " + desde + " hasta " + hasta);

        for (int i = desde; i <= hasta; i++) {
            if (esPar(i)) {
                System.out.print(i + " ");
            }
        }

        continuar();
    }

    public static void numerosPrimos(int desde, int hasta) {
        limpiarPantalla();
        System.out.println("Numeros primos desde " + desde + " hasta " + hasta);

        for (int i = desde; i <= hasta; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        continuar();
    }
}
