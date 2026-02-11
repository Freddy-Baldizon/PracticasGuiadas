package practica;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        valorAlto();
        valorBajo();
        segundoMayor();
        suma();
        cuadrado();
    }

    public static void valorAlto() {
        int[] numbers = { 1, 20, 3, 4, 5 };
        int mayor = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > mayor) {
                mayor = numbers[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);

    }

    public static void valorBajo() {
        int[] numbers = { 10, 20, 3, 40, 50 };
        int bajo = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < bajo) {
                bajo = numbers[i];
            }
        }
        System.out.println("El numero menor es: " + bajo);

    }

    public static void cuadrado() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] cuadrado = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            cuadrado[i] *= numbers[i]; 
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("EL arreglo original es: " + numbers[i]);
        }

        for (int i = 0; i < cuadrado.length; i++) {
            System.out.println("EL arreglo al cuadrado es: " + cuadrado[i]);
        }
    }

    public static void suma() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        System.out.println("La suma total es: " + suma);
    }
    
    public static void segundoMayor(){
        int[] numbers = { 1, 2, 3, 40, 5 };
        int mayor = numbers[0];
        int segundoMayor = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > mayor) {
                mayor = numbers[i];
                segundoMayor = mayor;
            }
        }
        System.out.println("El segundo numero mayor es: " + mayor);
    }

}
