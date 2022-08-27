package algorithmization.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        exchangeSort();
    }

    private static void printer(int[] array){
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
    private static void swap(int[] array, int firstIndex, int secondIndex){
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;

    }

    private static void concatTwoArrays(){
        final int FIRST_ARRAY_SIZE = 9;
        final int SECOND_ARRAY_SIZE = 10;
        int k = 4;
        int[] firstArray = new int[FIRST_ARRAY_SIZE];
        for (int i = 0; i < FIRST_ARRAY_SIZE; i++) {
            firstArray[i] = (int) (Math.random()*10);
        }
        System.out.println("First array: ");
        printer(firstArray);
        int[] secondArray = new int[SECOND_ARRAY_SIZE];
        for (int i = 0; i < SECOND_ARRAY_SIZE; i++) {
            secondArray[i] = (int) (Math.random()*10);
        }
        System.out.println("\nSecond array: ");
        printer(secondArray);
        int amountSecArr= 0;
        int[] newArray = new int[FIRST_ARRAY_SIZE+SECOND_ARRAY_SIZE];
        for (int i = 0; i < newArray.length; i++) {
            if(i+SECOND_ARRAY_SIZE+1 <= newArray.length) {
                if (i <= k) {
                    newArray[i] = firstArray[i];
                } else if (i > k && amountSecArr<1) {
                    amountSecArr++;
                    for (int j = 0, l = i; j < SECOND_ARRAY_SIZE; j++, l++) {
                        newArray[l] = secondArray[j];
                    }
                    i--;
                } else {
                    newArray[i + SECOND_ARRAY_SIZE] = firstArray[i];
                }
            }
        }
        System.out.println("\nNew Array: ");
        printer(newArray);

    }

    //bubble sort
    private static void createNewAscendingSequence(){
        int[] firstSequence = new int[]{1,2,3,4,5,6,7};
        int[] secondSequence = new int[]{2,4,5,6,8,9};

        int[] newSequence = new int[firstSequence.length+ secondSequence.length];
        int count = 0;
        for (int i = 0; i < firstSequence.length; i++) {
            newSequence[i]= firstSequence[i];
            count++;
        }
        for (int i = 0; i < secondSequence.length; i++) {
            newSequence[count++] = secondSequence[i];
        }
        //bubble sort
        for (int i = newSequence.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {

                if(newSequence[j] > newSequence[j+1]){
                    swap(newSequence,j,j+1);
                }
            }
        }
        printer(newSequence);


    }


    //selectionSort
    private static void selectionSort(){
        int[] array = {1,2,3,4,5,6};

        for (int i = 0; i < array.length; i++) {
            int indexMaxElement = i;

            for (int j = i; j < array.length; j++) {
                if(array[j] > array[indexMaxElement]){
                    indexMaxElement=j;
                }
                swap(array,i,indexMaxElement);
            }
        }
        printer(array);
    }

    private static void exchangeSort()  {
        int[] array = {2,4,6,7,8,9};
        int permutation = 0;
        for (int i = array.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j]<array[j+1]){
                    swap(array,j,j+1);
                    permutation++;
                }
            }
        }
        printer(array);
        System.out.println("\nPermutation's count - " + permutation);


    }

    private static int binarySearch(int array[], int elementToSearch){
        int firstIndex = 0;
        int lastIndex = array.length-1;

        while(firstIndex<=lastIndex){
            int middleIndex = (firstIndex +lastIndex)/2;
            if(array[middleIndex] == elementToSearch){
                return middleIndex;
            } else if(array[middleIndex]<elementToSearch){
                firstIndex = middleIndex+1;
            } else if(array[middleIndex]> elementToSearch){
                lastIndex = middleIndex-1;
            }
        }
        return -1;
    }


    private static void insertSort(){



    }

}

