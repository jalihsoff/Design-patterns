//Singleton
package design_pattern;

class A{  
 private static A obj=new A();//Early, instance will be created at load time
 private static A obj2=new A();//Early, instance will be created at load time
 private A(){}  
   
 public static A getA(){  
  return obj;  
 }  
  public static A getB(){  
  return obj2;  
 }  
 public void doSomething(){  
     System.out.println("Just one object");
 }  
}  
public class Singleton {
    public static void main(String args[]){
        A x = A.getA();
        x.doSomething();
        A y = A.getB();
        y.doSomething();
    }
}
