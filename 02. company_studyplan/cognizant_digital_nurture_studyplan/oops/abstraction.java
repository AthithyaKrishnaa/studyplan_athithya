// abstraction

package study.oops;

class abstraction{
    public static void main(String[] args){
        Animal obj = new Animal();
        obj.sound();
    }
}
abstract class Dog{
    abstract void sound();
}
class Animal extends Dog{
    void sound(){
        System.out.println("bow");
    }
}
