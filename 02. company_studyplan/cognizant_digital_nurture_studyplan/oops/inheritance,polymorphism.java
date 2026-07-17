package oops;
// Inheritance, Method Overloading and Method Overriding

class Main extends Animal{
    public static void main(String[] args){
        // inheritance
        dog();
        // method overload
        add(10,20);
        add(10.5,20.5);
        // method override
        Main obj = new Main();
        obj.cat();
    }
    // @Override
    void cat(){
            System.out.println("meow");
    }
}

class Animal{
    static void dog(){
        System.out.println("bow");
    }
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println(a+b);
    }
    void cat(){
        System.out.println("animal");
    }
}



