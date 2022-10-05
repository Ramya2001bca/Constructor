public class Customer{
String name;
int age;
long phonenumber;
int aadharnumber;
public  Customer(String name,int age,long phonenumber,int aadharnumber){
System.out.println(name+"\n"+age+"\n"+phonenumber+"\n"+aadharnumber);
}
public  Customer(String name,int phonenumber,int age){
System.out.println(name+"\n"+phonenumber+"\n"+age);
}
public  Customer(String name){
System.out.println("name"+name);
}
}
