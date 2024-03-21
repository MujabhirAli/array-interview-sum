//Create a new array copyNumbers and copy all elements from numbers to copyNumbers.

public class Arrayex9 {
    public static void main(String args[]) {
        int numbers[] = {1, 10, 3, 4, 5}; 
        int copyNumbers[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
        System.out.print("copyNumbers: ");
        for (int num : copyNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
