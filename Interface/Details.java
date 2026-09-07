interface Display {
    void showDetails();
}

class Learner implements Display {
    String learnerName;
    int learnerNumber;
    String learnerCourse;

    Learner(String learnerName, int learnerNumber, String learnerCourse) {
        this.learnerName = learnerName;
        this.learnerNumber = learnerNumber;
        this.learnerCourse = learnerCourse;
    }

    public void showDetails() {
        System.out.println("Learner Details");
        System.out.println("Name    : " + learnerName);
        System.out.println("Number  : " + learnerNumber);
        System.out.println("Course  : " + learnerCourse);
    }
}

class Staff implements Display {
    String staffName;
    int staffNumber;
    double staffSalary;

    Staff(String staffName, int staffNumber, double staffSalary) {
        this.staffName = staffName;
        this.staffNumber = staffNumber;
        this.staffSalary = staffSalary;
    }

    public void showDetails() {
        System.out.println("Staff Details");
        System.out.println("Name   : " + staffName);
        System.out.println("ID     : " + staffNumber);
        System.out.println("Salary : " + staffSalary);
    }
}

public class Details {
    public static void main(String[] args) {

        Display learnerObj = new Learner("Ram", 75, "Btech CSE");
        Display staffObj = new Staff("Shyam", 27, 500000);

        learnerObj.showDetails();
        System.out.println();

        staffObj.showDetails();
    }
}
