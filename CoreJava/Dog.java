package CoreJava;

/**
 * Created by Skatukam on 02/25/2018.
 */
class Animal {
    public void eat()
    {
        System.out.println("Animal Eats");
    }
}
public class Dog extends Animal{

        public void eat()
        {
            System.out.println("Dog Eats");
        }
        public void walk(){
            System.out.println("Dog walks");
        }
        public static void main(String args[])
        {
            Animal animal=new Animal();
            Dog dog=new Dog();
            Animal animal1=new Dog();
            //Dog dog1= (Dog) new Animal();
            animal.eat();
            dog.eat();
            animal1.eat();
            
        }

}
