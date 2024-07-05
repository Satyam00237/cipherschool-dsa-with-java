//Strings 

import java.util.*;
public class StringStudy{
public static void main(String[] args)
{
String name = "Cipher Schools";
String name2 = "Cipher Schools";
String name3 = new String("Cipher Schools");
String name4 = new String("Cipher Schools");

System.out.println(name==name2);
System.out.println(name3==name4);
System.out.println(name==name3);

String s1 = "Hello";
s1= s1 +"peeps";
System.out.println(s1);
System.out.println(s1+",how're you doing");
System.out.println(s1);

String s2= new String("Hello");
String s3= new String("People");
s2= s2.concat(s3);
System.out.println(s4);
System.out.println(s2);

System.out.println("*******************");

System.out.println("CHECKING STRINGS ARE EQUAL IN VALUE");

System.out.println(Name.equals(name2));
System.out.println(Name.equals(name3));

System.out.println("*******************");

System.out.println("3) Creating new string object from character array");

char arr[] = {'C', 'I', 'P', 'H', 'E', 'R'};
String partialStrFromArr = new String(arr, 1, 3);
System.out.println(partialStrFromArr);

String partialStrFromArr2 = new String(arr, 2, 3);
System.out.println(partialStrFromArr2);

//changing cases
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());

System.out.println(name);

System.out.println("*******************");

//Splitting
System.out.println("Splitting);
System.out.println("Please enter your full name");
Scanner sc=new Scanner(System.in);
String fullName = sc.nextLine();
String strArr[] = fullName.split(" ");
for (int i=0; i<strArr.length; i++)
{
System.out.println(strArr[i]);
}

String csvText = sc.nextLine();
String csvArr[] = csvArr.split(",");
for (int i=0; i<csvArr.length; i++)
{
System.out.println(csvArr[i]);
}

String dotText = sc.nextLine();
String dotArr[] = dotArr.split(",");
for (int i=0; i<dotArr.length; i++)
{
System.out.println(dotArr[i]);
}


String backSlashText = "Hello, I attend \"Java\" class";
String backSlashText[] = backSlashText.split(",");
for (int i=0; i<backSlashText.length; i++)
{
System.out.println(backSlashText[i]);
}

//Length of string

System.out.println("*******************");
System.out.println("Length of string");
int len = name.length();
System.out.println("length of: "+name+" is: " +len);

//finding index of a char in a string

System.out.println("*******************");
System.out.println("Finding index of string");

int index = name.indexOf('e');
System.out.println("index of 'e' in: "+name+" is: " +index);

int index2 = name.indexOf('E');
System.out.println("index of 'E' in: "+name+" is: " +index2);

int index3 = name.indexOf('School');
System.out.println("index of School in: "+name+" is: " +index3);

int index4 = name.indexOf('o', 10);
System.out.println("index of 'o' in: "+name+" is: " +index4);

int indexOfO = 0;
//while(indexOfO != -1)
while(true)
{
int indexOfO = name.indexOf('o', indexOfO + 1);
if(indexOfO == -1) break;
System.out.println("O found at : "+indexOfO);

}

}
}
