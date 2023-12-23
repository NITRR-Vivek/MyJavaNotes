class Mahesh{
int x; //instance(object) member variable;
int y = 5;
void fun1(){ //instance(object) member function
System.out.println("fun1");
}

}

class NonStaticFunction {
public static void main (String []args){

Mahesh m1 = new Mahesh();
Mahesh m2 = new Mahesh();
m2.x = 10;
m2.y = 15;
System.out.println(m1.x);
System.out.println(m1.y);
System.out.println(m2.x);
System.out.println(m2.y);

}
}
