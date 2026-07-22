// exception handling

// try, catch, finally, throw, throws 
package array_strings_eh;

// try, catch, finally, throw, throws
class exceptionhandling {
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally block");
        }
        try{
            checkNum(-1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    static void checkNum(int num) throws Exception{
        if(num<0){
            throw new Exception("Less than zero");
        }
    }
}
