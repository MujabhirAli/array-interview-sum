//Average of Elements: Calculate and print the average of all elements in the array numbers.//


public class Arrayex6 {
public static void main(String args[]) {
int numbers[]={1,10,3,4,5};
int sum=0;
for(int i=0;i<numbers.length;i++){
sum+=numbers[i];
}
double average=(double)sum/numbers.length;
System.out.println("average of all elements:"+average);
}
}
