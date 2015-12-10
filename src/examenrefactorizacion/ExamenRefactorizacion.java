package examenrefactorizacion;
import java.util.Scanner;
public class ExamenRefactorizacion {

    public static boolean esPrimo = false;

    public static void main(String[] args) {
        int totalDigitos = 3;
        int numDigitos = 0;
            introducirDigitos(totalDigitos);
        for (int numeroComparar = 1; numeroComparar <= 99999; numeroComparar++) {
            int aux = numeroComparar;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            numDigitos = contador;

            if (numDigitos == totalDigitos) {
                if (numeroComparar < 4) {
                    esPrimo = true;
                } else {
                    if (numeroComparar % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (numeroComparar - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (numeroComparar % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(numeroComparar);
                }
            }
        }
    }
//    public static int introducirDigitos(int totalDigitos){
//        Scanner aux=new Scanner(System.in);
//        if (totalDigitos <= 0) {
//            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
//            totalDigitos=aux.nextInt();
//        }
//        return totalDigitos;
//    }
//}
