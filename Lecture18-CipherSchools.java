import java.util.*;

public class ArrayInput{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of the array");
int n = sc.nextInt();
int arr[] = new int[n];
for(int i =0; i<n; i++)
{
System.out.println("Please enter "+ (i+1) + "element: ");
arr[i] = sc.nextInt();
}
System.out.println("Array is: ");
for(int i=0; i<n; i++)
{
System.out.println(arr[i]+" ");
}
sc.close();
}
}
