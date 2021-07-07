import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        System.out.println(" User Registration Form ");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Mobile Number :");
        String mobNo = sc.nextLine();
        validateMobileNumber(mobNo);



        System.out.println("Enter First Name :");
        String firstName = sc.next();
        validateName(firstName);

        System.out.println("Enter Last Name :");
        String lastName = sc.next();
        validateName(lastName);

        System.out.println("Enter Email id :");
        String email = sc.next();
        validateEmail(email);

        System.out.println("Enter Password :");
        String password = sc.next();
        validatePassword(password);


        sc.close();
    }
    static void validateMobileNumber(String number) {
        String mobNoRegex = "^[7-9]{1}[0-9]{9}$";

        if (Pattern.compile(mobNoRegex).matcher(number).matches())
            System.out.println("Valid");
        else
            System.out.println("Mobile number should contain country code follow by space and 10 digit number.");

    }

        static void validateName (String name){
            String nameRegex = "^[A-Z][a-z]{2,}$";
            if (Pattern.compile(nameRegex).matcher(name).matches())
                System.out.println("Valid");
            else

                System.out.println("Name should start with capital letter and need min 3 characters.");
        }

    static void validateEmail(String email) {
        String emailRegex = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";

        if (Pattern.compile(emailRegex).matcher(email).matches())
            System.out.println("Valid");
        else
            System.out.println("Invalid email id");

}
    static void validatePassword(String password) {
        String passwordRegex = "[\\w\\W]{8,}";

        if (Pattern.compile(passwordRegex).matcher(password).matches())
            System.out.println("Valid");
        else
            System.out.println("Password should contain minimum 8 characters.");
    }

}