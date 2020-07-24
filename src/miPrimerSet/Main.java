package miPrimerSet;
//Escribir un programa que cree un Set y añada 100 elementos aleatorios (0-100) e imprimirlo

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setList = new TreeSet<>();
        Random rndm = new Random();

        while (setList.size() < 50) {
            setList.add(rndm.nextInt(101));
        }

        for (Integer lista : setList) {
            System.out.println(lista);
        }

        //A partir del set anterior, escribir un programa que pregunte un número y compruebe si está o no está en el set (contains())
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nº a ver si se ha generado:");
        int numInput = sc.nextInt();
        boolean comprobante = false;
        for (Integer lista : setList) {
            if (lista == numInput) {
                System.out.println("Número encontrado");
                comprobante = true;
            }
        }
        if (!comprobante) {
            System.out.println("Número no encontrado");
        }

        //Mucho más sencillo:
        System.out.println( setList.contains(numInput) ? "Número encontrado." : "Número no encontrado.");
    }
}
