import java.util.Scanner;
import java.util.Random;
/*
 * PasswordGenerator
 * A simple Java program to generate a random password of a specified length.
 */
public class PasswordGenerator
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // 0 to 10
        String characters = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkalmnopqrstuvwxyz1234567890!@#$%^&*()?/.><,"); // 100
        System.out.print("Enter Here Length : ");
        int length = sc.nextInt();
        // Using StringBuilder to efficiently build the password dynamically, as it allows for modification without creating new String objects.
        StringBuilder password = new StringBuilder();
        for(int i =1 ; i<=length ; i++)
        {
            int idx = random.nextInt(characters.length());
            password.append(characters.charAt(idx));
        }
       System.out.println("The Random generated password of length " + length + " is: " + password.toString());

    }
}
