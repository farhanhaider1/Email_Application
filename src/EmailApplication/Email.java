package EmailApplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailCapacity;
    private String alternateEmail;

    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void askDepartment(){
        Scanner in = new Scanner(System.in);
        System.out.println("Select department: " +
                "\n1 for Sales\n2 for Tech\n3 for Accounting" +
                "\n0 to skip");
        int choice = in.nextInt();
        setDepartment(choice);
    }

    private void setDepartment(int choice) {
        if(choice == 1){
            this.department = "Sales";
        }
    }
}
