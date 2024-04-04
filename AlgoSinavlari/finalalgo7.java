package AlgoSinavlari;

public class finalalgo7 {
      public static void main(String[] args) {
   A a = new A();
   B b = new B();
   C c = new C();
   a.p("10");
   a.p(10.0);
   a.p(10);
   b.p(10);
   b.p(10.0);
   }
  }
class C {
public void p(int i) {
System.out.println("sonuc: " + i * 2.2);
}
public void p(double i) {
System.out.println("sonuc: " + i * 6.6);
}
}
class B extends C {
public void p(int i) {
System.out.println("sonuc: " + i * 3.3);
}
}
class A extends B {
public void p(double i) {
System.out.println("sonuc: " + i * 4.4);
}
public void p(String i) {
System.out.println("sonuc: " + i +10*2.2);
}
}
