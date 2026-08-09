// Encapsulation in Java.

/*
Encapsulation means, Hiding the implementation details from user and showing only the necessary information. This can be achieved through making the attribute and even some important methods private and access to them using other public methods. These methods are generally called getter and setter.
*/

public class Tutorial18 {


    // creating a private variable.
    private long aadharNo = 3784536983l; 
    
    // Getter method for the aadhar;
    public long getAadhar() {
        return aadharNo;
    }

    // Setter method for aadhar;
    public void setAadhar(long aadhar) {
        aadharNo = aadhar;
         System.out.println("Aadhar number is changed ....");
    }

    public static void main(String[] args) {

        Tutorial18 obj = new Tutorial18();

        long result = obj.getAadhar();
        System.out.println("The aadhar number is : " + result);

        System.out.println("Changing the aadhar .....");
        obj.setAadhar(4567234309l);

        System.out.println("The value of aadhar is updated ..... new value => ");
        result = obj.getAadhar();

        System.out.println("The new aadhar is : " + result);
    }
}
