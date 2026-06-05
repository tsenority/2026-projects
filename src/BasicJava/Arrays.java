package BasicJava;

public class Arrays {
    public static void main(String[] args) {
        //Declaration of variables  Array is used to store multiple values of same data type.
        int numbers[] = new int[5];
        numbers[0] = 5;   //indexing starting from 0
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;
        //numbers[1] = 50; // will replace the value of index 1.


        //numbers[5] = 40; //can't add more coz the array size is always fixed.

        System.out.println(numbers[2]);
        System.out.println(numbers.length); //to find the capacity of an array

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            //will print all the values of array using loop.
            //ascending order

            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
                //will print the reverse order

            }
        }
    }
