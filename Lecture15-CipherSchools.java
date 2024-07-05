import java.util.*;

public class ArrayStudy
{
public static void main(String[] args)
{
for (i=0; i<arr.length; i++)
{
System.out.println(arr[i] + " ");
}
System.out.println();
}
int size = 5;
int arr[] = new int[size];

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);

print(arr);

for(int i=0; i<size; i++)
{
arr[i] = i+1;
}

print(arr);

int arr2[] = {1,2,3};
print(arr2);

int copyArray[] = new int[2*size];
for (int i= 0; i<size; i++)
{
copyArray[i] = arr[i];
}
CopyArray[5] = 6;
CopyArray[6] = 7;
print(copyArray);

}
}

=================

passing array

import java.util.*;

public class PassingArray
{
static void addOne(int x)
{
x = x+1;
}
static void addOne(int arr[])
{
for (int i=0; i<arr.length; i++)
{
arr[i]++;
}
}
public static void main(String[] args)
{
int x = 10;
addOne(x);
System.out.println(x);

int arr[] = {1, 2, 3, 4, 5};
addOne(x);


for(int i=0; i<arr.length; i++)
{
System.out.println(arr[i] + " ");
}
System.out.println();
}
}
