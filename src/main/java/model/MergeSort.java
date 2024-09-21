package model;

import java.util.Comparator;

public class MergeSort <T> implements Comparator<T> {

    public T[] sortArray(T[] arrayA){
        if(arrayA == null){return null;}
        if(arrayA.length < 2){return arrayA;}
        T[] arrayB = new T[arrayA.length/2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length/2);
        T[] arrayC = new T[arrayA.length - arrayA.length/2];
        System.arraycopy(arrayA, arrayA.length/2, arrayC, 0, arrayA.length - arrayA.length/2);
        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }
    private void mergeArray(T[] array, T[] arrayB, T[] arrayC) {

        int positionB = 0;
        int positionC = 0;

        for (int c = 0; c < array.length; c++) {
            if (positionB == arrayB.length) {
                array[c] = arrayC[positionC];
                positionC++;
            } else if (positionC == arrayC.length) {
                array[c] = arrayB[positionB];
                positionB++;
            } else if (arrayB[positionB] < arrayC[positionC]) {
                array[c] = arrayB[positionB];
                positionB++;
            } else {
                array[c] = arrayC[positionC];
                positionC++;
            }
        }
    }

    @Override
    public int compare(T o1, T o2) {
        return o1.getName.size + o1.;
    }
}
