// exception handling

// try, catch, finally, throw, throws 
package study;

class exceptionhandling{
    static void checknum(int num) throws Exception{
        if(num<0){
            throw new Exception("Number less than zero");
        }
    }
    public static void main(String[] args){
        try{
            int a=10;
            int b=10;
            
            System.out.println(a/b);
            checknum(-5);
        }
        catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}