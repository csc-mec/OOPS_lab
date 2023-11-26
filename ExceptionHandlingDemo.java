public class ExceptionHandlingDemo{

    static void divide(int x , int y) throws ArithmeticException{
        int c;
        try{
            c = x/y;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    static void throwErrorExample(){
        try{
            throw new Exception("thrown an exception");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        divide(1,0);
        throwErrorExample();
    }
}