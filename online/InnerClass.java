

class A
{
  public void show()
  {
    System.out.println("in showo");
  }

  class B
  {
    public void config()
    {
      System.out.println("in config");
    }
  }
}

public class InnerClass
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new A.B();
        obj1.config();
      
    }
}
