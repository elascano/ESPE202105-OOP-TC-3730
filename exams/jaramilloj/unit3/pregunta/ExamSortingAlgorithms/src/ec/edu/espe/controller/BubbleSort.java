/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Jaramillo Jean CODE ESPE-DCC0
 */
public class BubbleSort implements SortingStrategy {

    
    @Override
    public int[] sort(int[] data) {
        System.out.println("ordering " + data + ", using Bubble sort");
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
        printArray(data, data.length);
        return data;
    }

    public void swap(int[] array, int a, int b) {
        int value = array[b];
        array[b] = array[a];
        array[a] = value;
    }

    public void printArray(int[] data, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
