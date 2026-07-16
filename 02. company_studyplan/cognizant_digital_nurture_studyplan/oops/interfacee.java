// interface

package study.oops;

class interfacee{
    public static void main(String[] args){
        Animal obj = new Animal();
        obj.sound();
    }
}
interface Dog{
    void sound();
}

class Animal implements Dog{
    public void sound(){
        System.out.println("Bow");
    }
}

