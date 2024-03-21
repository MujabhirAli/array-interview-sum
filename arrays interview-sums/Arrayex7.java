//Find and print the maximum element in the array numbers
public class Arrayex7 {
    public static void main(String args[]) {
        int numbers[] = {1, 10, 3, 4, 5}; 
        int sum = 0; 
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Maximum element: " + max);
    }
}
