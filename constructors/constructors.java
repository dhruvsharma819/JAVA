class Student{
    String name;
    int prn;
    int weight;
    int age;

    Student(){              // a default constructor is constructed here 
        name="default";
        age=0;
        prn=0;
        weight=0;
            }

    Student(String n , int p ,int a , int wg ){     //  parameterized constructor is called here
        name=n;
        prn=p;
        age=a;
        weight=wg;
    }             

    Student(Student copySt){         //here copy constructor is called (here object reference is used , reference acts like pointer and also holds memory address of object)
        this.name=copySt.name;
        this.prn=copySt.prn;
        this.age=copySt.age;
        this.weight=copySt.weight;
            }     

    void display(){
        System.out.println("name="+name);
        System.out.println("prn="+prn);
        System.out.println("age="+age);
        System.out.println("weight="+weight);
    }                    
}

public class constructors{
    public static void main(String[] args) {
        Student s1 = new Student();             //default constructor is called
        Student s2 = new Student("Ram",10,17,60);   //parameterised is  called 
        Student s3 = new Student("Shyam",11,17,70);  //parameterised constructor is  called 
        Student s4 = new Student(s1);       //copy constructor is  called 
        Student s5 = new Student(s3);       //copy constructor is  called


        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}