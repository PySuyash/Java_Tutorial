// About Java inheritance.

/* 
Extending one class using another by extends keyword is inheritance.

subclass: The child class, which is inherited from another class.
superclass: The class which inherit another class.

*/


// Super class
class Employee {
    public int empID;
    public double salary;
}


// Subclass
class Teacher extends Employee {
    public String profession;


    // setter method to set the values.
    public void setInfo(int ID, double salary, String profession) {
        this.empID = ID;
        this.salary = salary;
        this.profession = profession;
    }


    // getter method to get values.
    public String getInfo() {
        return "ID: " + this.empID + ", Salary: " + this.salary + ", Profession: " + this.profession;
    }
}

public class Tutorial19 {
    public static void main(String[] args) {

        // Creating an instance of the Teacher class.
        Teacher T1 = new Teacher();

        // setting the info.
        T1.setInfo(34, 345600d, "Teacher");


        // getting the info.
        String info = T1.getInfo();
        System.out.println(info);
    }
}