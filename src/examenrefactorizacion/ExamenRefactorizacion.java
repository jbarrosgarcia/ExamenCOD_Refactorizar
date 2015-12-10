package examenrefactorizacion;

import java.util.Scanner;

public class ExamenRefactorizacion {

    public static boolean esPrimo = false;
    public static int totalDigitos = 3;

    public static void main(String[] args) {

        int numDigitos = 0;
        introducirDigitos();
        for (int numeroComparar = 1; numeroComparar <= 99999; numeroComparar++) {
            int divisionEntera = numeroComparar;

            int contador = 0;
            contadorDivisionEntera(numeroComparar);
           
            if (numDigitos == totalDigitos) {
                if (numeroComparar < 4) {
                    esPrimo = true;
                } else {
                    if (numeroComparar % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contadorDivisiones = 0;
                        int i1 = 1;
                        int limite = (numeroComparar - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }
                        esPrimo = calculaNumDivisores(i1, limite, numeroComparar, contadorDivisiones);
                    }
                }

                if (esPrimo == true) {
                    System.out.println(numeroComparar);
                }
            }
        }
    }
     public static boolean calculaNumDivisores(int i1, int limite, int numComparar, int contadorDivisores) {
        boolean esPrimo = false;
        while (i1 <= limite) {
            if (numComparar % i1 == 0) {
                contadorDivisores++;
            }
            i1 += 2;
            if (contadorDivisores == 2) {
                i1 = limite + 1;
            }
        }
        if (contadorDivisores == 1) {
            esPrimo = true;
        }
        return esPrimo;
    }

    public static int introducirDigitos() {
        Scanner aux = new Scanner(System.in);
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        if (totalDigitos <= 0) {

            totalDigitos = aux.nextInt();
        } else {
            if (totalDigitos <= 0) {
                System.out.println("Ingreso un numero erroneo por favor\nIngrese como parámetro, un numero de digitos correcto (mayor que 0): ");
                totalDigitos = aux.nextInt();
            }
        }

        return totalDigitos;
    }
      public static int contadorDivisionEntera(int numComparar) {
        int ndigitos;
        //cambia i por numcomparar.
        int divisionEntera = numComparar;
        int contador = 0;
        while (divisionEntera != 0) {
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        ndigitos = contador;
        return ndigitos;
    }
}