//super keyword

/*class A
{
int num=10;
}

class B extends A
{
  int num=20;
  void print()
  {
    System.out.println("num=" + num); //subclass num
    System.out.println("num=" + super.num); //suoer class num
  }
}

public class Superkeyword
{
  public static void main(String[] args)
  {
    B b=new B();
    b.print();
  }
}
*/


/*
class Animal
{
  void eat()
  {
    System.out.println("Eating...");
  }
}

class Dog extends Animal
{
  void eat()
  {
    System.out.println("Eating pedegree..."); 
  }
  void bark()
  {
    System.out.println("Barking");
  }
  
  void work()
  {
    eat();
    bark();
    super.eat();
  }
}

public class Superkeyword
{
  public static void main(String[] args)
  {
    Dog d=new Dog();
    //d.eat();
    //d.bark();
    d.work();
  }
}

*/


class Animal
{
  Animal()
  {
    System.out.println("Animal is created...");
  }
}

class Dog extends Animal
{
  Dog()
  {
    super();
    System.out.println("Dog is created..."); 
  }
}

public class Superkeyword
{
  public static void main(String[] args)
  {
    Dog d=new Dog();
  }
}
 


   
