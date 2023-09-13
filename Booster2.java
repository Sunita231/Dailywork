class Booster2
{
void reverseString()
{

String str1="";
String str="JAVA";

for(int i=str.length()-1;i>=0;i--)
{
str1=str1+str.charAt(i);
}
System.out.print(str);
}


public static void main(String[] args)
{

Booster2 b1=new Booster2();
b1.reverseString();
}
}