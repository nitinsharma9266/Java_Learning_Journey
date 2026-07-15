// abstract class A{
//     // abstract class ke andar hum function ko define aur declare dono kar sakte hai
//     // lekin jo method sirf declare hoga uske aage abstract lagana zaruri hai
//     abstract void f1();
//     void f2(){
//         System.out.println("F2 in A");
//     }
// }

// interface B {
//     // interface ke andar methods sirf declare hote hain (by default abstract hote hain)
//     void f1();
//     void f2();  
// }

// class C extends A implements B{
//     public void f1(){ }
//     public void f2(){ }
// }

// public class Threetypesclasses {
//     public static void main(String[] args) {
//         // A a = new A();  // abstract class ka object nahi banta
//         // B b = new B();  // interface ka object direct nahi banta

//         C c = new C();
//         c.f1();
//         c.f2();
//     }
// }