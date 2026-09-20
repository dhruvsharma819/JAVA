// super class without exception declaration
class SuperClass {
    void methord(){
        System.out.println("SuperClass methord got exceuted");
    }
}

class SubClass extends Superclass {
    void methord() throws ArithmeticException {
        System.out.println("Subclass methord got exceuted");
        throw new ArithmeticException("exception in subclass");
    }

    public static void main(String[] args) {
        Superclass s = new Subclass();
        try {
            s.methord();
        }
        catch(ArithmeticException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}