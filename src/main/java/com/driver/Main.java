package com.driver;

public class Main {
  public static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }
    public static class B extends A{
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args){
        A obj1 = new A();
        obj1.meth();
        A obj = new B();
        obj.meth();

    }
}