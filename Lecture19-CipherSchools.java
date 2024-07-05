import java.util.*;

public class TimeComplexity{
static boolean isPrimeRam(int n)
{
public static void main (String[] args)
{

if(n<=1) return false;
if(n==2) return true;

for (int i = 2l i<n; i++)
{
if (n%i == 0) return false;
}
return true;
}
static boolean isPrimeSham(int n)
{
public static void main (String[] args)
{

if(n<=1) return false;
if(n==2) return true;

for (int i = 2l i<Math.sqrt(n); i++)
{
if (n%i == 0) return false;
}
return true;
}

public static void main(String[] args)
int n=10000;
long start =System.currentTimeMillis();
System.out.println(isPrimeRam(n));
long end =System.currentTimeMillis();
start =System.currentTimeMillis();
System.out.println(isPrimeSham(n));
end =System.currentTimeMillis();
System.out.println(("time by sham's approach: "+ (end-start));
}
}
