class MethOverAndStatVarA {

    static int count;
    int a;
    int b;

    MethOverAndStatVarA() {
        a = 10;
        b = 15;
        count++;
    }

    MethOverAndStatVarA(int x, int y) {
        a = x;
        b = y;
        count++;
    }

    static void countShow() {
        System.out.println("Total number of objects: " + count);
    }

    // version 1
    void show(){
        System.out.println("vale of a:" +a);
        System.out.println("vale of b:" +b);
    }

    // version 2
    void show(int x , int y){
        System.out.println("vale of a:" +x);
        System.out.println("vale of b:" +y);
    }

    void show(int x){
        System.out.println("value passed:" +x);
    }


    public static void main(String[] args) {

        MethOverAndStatVarA m1 = new MethOverAndStatVarA();
        m1.show();
        MethOverAndStatVarA m2 = new MethOverAndStatVarA(55,45);
        m2.show(m2.a,m2.b);
        MethOverAndStatVarA m3 = new MethOverAndStatVarA(100,200);
        m3.show(m3.a);
        m3.show(m3.b);

        MethOverAndStatVarA.countShow();
    }
}