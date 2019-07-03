package com.stackroute.junit;
//This is used to sort the numbers and also to given the sum of the even numbers.
public class SortingTheNumbers {
    int sum = 0, remainder, count = 0, i;

    public int sum(int input) {     //This method prints the number in descending order and gives sum of even numbers
        int temp = input;
//It is used to get the sum of the even numbers in the given digit
        while (temp != 0) {
            remainder = temp % 10;
            if (remainder % 2 == 0)
                sum = sum + remainder;
            temp = temp / 10;
            count++;
        }
        sumCheck(sum);
        return sum;
    }
//this is used to check the result of the sum is less or grester than the 15
    public boolean sumCheck(int sum) {
        boolean result;
        if (sum < 15) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
//It is used to sort the digits in the descending order.
    public int[] order(int input, int size) {

        int temp = input;

        int[] arr = new int[size];
        for (i = 0; size > i; i++) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }

        for (i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] < arr[j]) {

                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }
            }
        }


        return arr;

    }
}
