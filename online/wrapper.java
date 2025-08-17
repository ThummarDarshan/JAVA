
/*
 What are Wrapper Classes?
   In Java, **wrapper classes** are used to convert **primitive data types** into **objects**.
   Every primitive type has a corresponding wrapper class in `java.lang` package.


 Why use Wrapper Classes?
  1. **Collections (e.g., ArrayList, HashMap)** only work with objects, not primitives.
  2. Provide useful **utility methods** (like `Integer.parseInt("123")`).
  3. Used in **autoboxing/unboxing** (automatic conversion between primitive and wrapper).

---
*/
// Example Code


public class Main {
    public static void main(String[] args) {
        // Primitive
        int a = 10;

        // Wrapper object (Boxing)
        Integer obj = Integer.valueOf(a); 

        // Autoboxing (Java does this automatically)
        Integer autoObj = a;  

        // Unboxing (object to primitive)
        int b = obj.intValue();

        // Auto-unboxing
        int c = autoObj;

        System.out.println("Primitive: " + a);
        System.out.println("Wrapper (Boxing): " + obj);
        System.out.println("Autoboxing: " + autoObj);
        System.out.println("Unboxing: " + b);
        System.out.println("Auto-unboxing: " + c);
    }
}
/*
Output :-
  
Primitive: 10
Wrapper (Boxing): 10
Autoboxing: 10
Unboxing: 10
Auto-unboxing: 10
*/
/*
 So in short:

Boxing → primitive → wrapper object
Unboxing → wrapper object → primitive
*/
