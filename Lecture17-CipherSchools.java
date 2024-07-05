import java.util.*;

public class JaggedArrays
{
static void printJaggedArray(int arr[][])
{
for(int i=0;i<arr.length; i++)
{
for int j=0; j<arr[0].length; j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}

public static void main(String[] args)
{
int arr[][] = new int[3][];
arr[0] = new int[3][];
arr[1] = new int[2];
arr[2] = new int[3];
printJaggedArrays(arr);

int arr2[][] = new int[3][];
arr2[0] = new int{1,2,3};
arr2[1] = new int{2,3};
arr2[2] = new int{4,5,6};
System.out.println("**************");
printJaggedArray(arr2);
}
}
}

         **************

Scanner input

import java.util.*;
public class ScannerStudy{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter your name: ");
String name  = sc.next();
String firstname = sc.next();
String lastname = sc.next();
System.out.println("Please enter your Profession: ");
String profession = sc.next();
Systrem.out.println("Please enter your address: ");
String address = sc.nextLine();
Systrem.out.println("Please enter your house number: ");
int number = Integer.parseInt(sc,nextLine());

System.out.println("First Name: "+firstname);
System.out.println("Last Name: "+lastname);
System.out.println("Profession: "+profession);
System.out.println("Address: "+address);
System.out.println("House Number: "+number);
}
}

 
