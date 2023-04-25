//Write a Java program to merge two given arrays.
//        Array1 = [10, 20, 30, 40, 50]
//        Array2 = [9, 18, 27, 36, 45]
//        Output :
//        Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
//        Hint: you can take 3rd array

import java.io.*;
class Program19
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size Of Array 1");
        int size1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[size1];
        System.out.println("Enter Elements of array1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter Size Of Array 2");
        int size2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[size2];
        System.out.println("Enter Elements of array2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int size3 = arr1.length + arr2.length;
        System.out.println("creating 3rd array for merging both the arrays ");
        int arr3[] = new int[size3];
        int t = 0;
        for (int i = 0; i < arr1.length; i++)
            arr3[i] = arr1[i];
        for (int i = arr1.length; i < arr3.length; i++)
            arr3[i] = arr2[t++];

        System.out.println("Printing merged array");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}