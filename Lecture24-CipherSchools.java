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

//blackslash

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

//extract a substring
System.out.println("*******************");
System.out.println("extract a substring");
String wF = "Wakanda Forever";
String subString = wF.subString(3);
System.out.println(subString);

String subString2 = wF.subString(3,7);
System.out.println(subString2);

//FINDING A CHARACTER AT A GIVEN INDEX
System.out.println("*******************");
System.out.println(name.charAt(4));
char charAtIndex = name.charAt(6);
System.out.println(charAtIndex);

//char array from string

System.out.println("*******************");
System.out.println("char array from string");
char arr2[] = name.toCharArray();
for(int i= 0; i<arr2.length; i++)
{
System.out.println(arr2[i]);
}

//Check if a string is empty

System.out.println("*******************");
System.out.println("Check if a string is empty");
String emptyString = new String();
String emptyString2 = "";
System.out.println(emptyString);
System.out.println(emptyString2);
System.out.println(emptyString.equals(""));
System.out.println(emptyString2.equals(""));
System.out.println(emptyString.isEmpty());
System.out.println(emptyString2.isEmpty());
System.out.println(blankString.isEmpty());
System.out.println(emptyString.isBlank());

// comparing strings lexicographically -> albhabetically
System.out.println("====================");
System.out.println("comparing strings lexicographically -> albhabetically");

String textOne = "QHey!";
String textTwo = "QBye!";
System.out.println(textOne.compareTo(textTwo));
System.out.println(textTwo.compareTo(textOne));
System.out.println(textOne.compareTo(textOne));

//Terminating white spaces from front and end
System.out.println("*******************");

System.out.println("Terminating white spaces from front and end");
String s5 = new String("Hello    ");
String s6 = new String("         Hello    ");
String s7 = new String("     Hello    People  ");
System.out.println("*"+ s5.trim() + "*");
System.out.println("*"+ s6.trim() + "*");
System.out.println("*"+ s7.trim() + "*");

//Replacing a character
System.out.println("*******************");

System.out.println("Replacing a character");
System.out.println(name.replace('o', 'O'));
System.out.println(name.replace('oo', 'OOOO'));

sc.close();
}
}
}
