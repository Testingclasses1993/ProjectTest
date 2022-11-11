class Add{

//Method Overloading in java
public static void add(int a,int b){

int sum=a+b;
System.out.println("Sum="+sum);
}
public static void add(double a,double b){

double sum=a+b;
System.out.println("Sum="+sum);
}
public static void add(short a,short b){

int sum=a+b;
System.out.println("Sum="+sum);
}
public static void main(String[] args)
{
add(63,92);
add(34.32,55.65);
add(125,443);
}
}