class strings{
public static void main(String args[])
{
String s="abcd";
String s1="abcd";
String i= s.concat("abcd");
System.out.println(s.equals(i));
System.out.println(s.equals(s1));
if(s.compareTo(i)<0)
System.out.println("s is greater");
if(s.compareTo(s1)>0)
System.out.println("s is not greater");
else
System.out.println("both are equal");
String s2= s.replace('b', 'v');
System.out.println(s2);
System.out.println("    Hello  World    ".trim());
}
}