package EmailApplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailCapacity;
    private String email;
    private String alternateEmail;
    private int passwordLength = 8;
    private final String companyName = "Company";

    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = setRandomPassword(passwordLength);
        this.email = generateEmail();
        printEmail();
        printPassword();
    }

    public String setDepartment(){
        Scanner in = new Scanner(System.in);
        System.out.println("Select department: " +
                "\n1 for Sales\n2 for Tech\n3 for Accounting" +
                "\n0 to skip");
        int choice = in.nextInt();
        return setDepartment(choice);
    }
    private String setDepartment(int choice) {
        if(choice == 1)
            return "Sales";
        else if(choice == 2)
            return "Technology";
        else if(choice == 3)
            return "Accounting";
        else if(choice == 0)
            return null;
        else
            throw new IllegalArgumentException();

    }

    private String setRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOP" +
                "1234567890!_-!";
        char[] password = new char[length];

        for(int i = 0;i<length;i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return new String(password);
    }
    private void printPassword(){
        System.out.println("Password: "+password);
    }

    public String generateEmail(){
        var email = firstName.toLowerCase()
                + "." + lastName.toLowerCase() +
                "@" + department + "." + companyName +
                ".com";
        return email;
    }
    public void printEmail(){
        System.out.println("Email: "+email);
    }

}
