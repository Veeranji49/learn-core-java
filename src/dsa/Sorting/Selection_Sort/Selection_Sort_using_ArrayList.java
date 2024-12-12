package dsa.Sorting.Selection_Sort;

import java.util.ArrayList;

public class Selection_Sort_using_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(64);
        numbers.add(34);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(90);

        System.out.println("Original ArrayList:");
        displayArrayList(numbers);

        selectionSort(numbers);

        System.out.println("Sorted ArrayList:");
        displayArrayList(numbers);
    }

    public static void selectionSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static void displayArrayList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
