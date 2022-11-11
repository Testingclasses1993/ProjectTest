class UserInput
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the name");
char c=scn.next().charAt(0);

System.out.println("Enter age");
int age=scn.nextInt();
System.out.println("Name="+c);
System.out.println("Age="+age);

//nextShort
//nextByte
//nextLong
//netFloat
//nextDouble
//nextBoolean

}
}