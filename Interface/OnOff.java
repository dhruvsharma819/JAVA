interface Switchable {
    void On();
}

class Bulb implements Switchable {
    public void On() {
        System.out.println("bulb has been turned on");
    }
}

class Fan implements Switchable {
    public void On() {
        System.out.println("Fan has been turned on");
    }
}

public class OnOff {
    public static void main(String[] args) {

        Switchable l1 = new Bulb();
        Switchable f1 = new Fan();

        l1.On();
        f1.On();
    }
}