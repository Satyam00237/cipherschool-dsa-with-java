//Multi-Dimensional Array
import java.util.*;
public class MultiDimArrays
{
public static void main(String[] args)
{
int rows = 5; 
int cols = 3;
int arr[][] = new int[rows][cols];

for(int i=0;i<arr.length; i++)
{
for int j=0; j<arr[0].length; j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}

//Array Initializers list
int arr2[][] = {
(1,2,3), 
(4,5,6),
(7,8,9)
};

for(int i=0;i<arr.length; i++)
{
for int j=0; j<arr[0].length; j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}

}
}

///////***Jagged arrays***///////
import java.util.*;

public class JaggedArrays
{
public static void main(String[] args)
{
int arr[][] = new int[3][];
arr[0] = new int[3];
arr[1] = new int[2];
arr[2] = new int[3];
for(int i=0;i<arr.length; i++)
{
for int j=0; j<arr[0].length; j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}

}
}
