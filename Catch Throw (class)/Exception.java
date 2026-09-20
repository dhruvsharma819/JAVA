
class Exception {
    static void fun(){
        try {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("Catch inside fun");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            fun();
            
        } catch(NullPointerException e) {
            System.out.println("Caught in null");
        }
    }
}