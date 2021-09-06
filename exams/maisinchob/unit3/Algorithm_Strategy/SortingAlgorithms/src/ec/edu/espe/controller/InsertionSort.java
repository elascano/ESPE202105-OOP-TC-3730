/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class InsertionSort implements SortingStrategy {

    //copyright <programmerclick@gmx.com>;
    public static void main(String[] args) {
        int[] arrays = {5, 2, 4, 6, 1, 3};

        System.out.println("La matriz original es:");
        for (int array : arrays) {
            System.out.print(array + "\t");
        }
        System.out.println();

        insertionSort(arrays);
    }

    /**
     * Insertar método de clasificación, ordenar los elementos de la matriz de
     * pequeños a grandes.
     *
     * @param El parámetro entrante es la matriz a ordenar
     * @return devuelve la matriz ordenada
     */
    public static int[] insertionSort(int[] arrays) {
        int length = arrays.length;
        int key = 0;
        // No hay ningún elemento antes del primer elemento, solo necesitamos atravesar 1 a length-1
        for (int i = 1; i < length; i++) {
            int j = i;
            // Asignar los elementos a colocar en esta ronda a la clave de variable intermedia
            key = arrays[i];
            // Desde la posición del elemento actual, compare gradualmente hacia adelante hasta que encuentre un elemento de matriz menor o igual que este elemento
            // Pon este elemento en esta posición, y los elementos del medio se moverán un poco hacia atrás sucesivamente.
            while (j > 0 && arrays[j - 1] > key) {
                arrays[j] = arrays[j - 1];
                j--;
            }
            arrays[j] = key;
            // Imprime los elementos de la matriz después de cada ronda
            System.out.println("El primer resultado de clasificación" + i + "es:");
            for (int array : arrays) {
                System.out.print(array + "\t");
            }
            System.out.println();
        }
        System.out.println("Fin de clasificación ------------------------------------");
        return arrays;
    }

    @Override
    public int[] sort(int[] data) {
        //TODO program the Insertion sort algorithm
        //sort the DATA and return It
        System.out.println("ordering" + data + ", using Insertion sort");
        int[] sortedData = data; //this is only here to compile
        return sortedData;
    }
}
