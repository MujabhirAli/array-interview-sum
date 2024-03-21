//Sum of Elements: Calculate and print the sum of all elements in the array numbers.//


public class Arrayex5 {
public static void main(String args[]) {
int numbers[] = {1, 10, 3, 4, 5}; 
int sum = 0; 
for (int i = 0; i < numbers.length; i++) {
sum += numbers[i];
}
System.out.println("Sum of all elements: " + sum);
}
}