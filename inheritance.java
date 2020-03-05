 class inheritance{  
    public static void main(String args[]){  
    A a= new A();
    B b = new B();
    C c = new C();
    D d = new D();
    a.printA();
    b.printB();
    c.printC();
    d.printD();
 
    }}
class A{
   int a=10;
   void printA()
   {
	System.out.println("Class A -base class\na="+a);
   }}
class B extends A{
   int b=20;
   void printB()
   {
	System.out.println("Class B - inheritance from A\na="+a+" b="+b);
   }}
class C extends B{
   int c=30;
   void printC()
   {
	System.out.println("Class C - inheritance from B\na="+a+" b="+b+" c="+c);
   }}

class D extends B{
   int d=40;
   void printD()
   {
	System.out.println("Class D - inheritance from B\na="+a+" b="+b+" d="+d);
   }}

