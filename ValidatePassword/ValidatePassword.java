import java.util.Scanner;

public class ValidatePassword
{
    static boolean validPassword = false;

    public static void main(String[] args)
    {
        while(!validPassword)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nPlease insert a password to be evaluated: ");
            String password = scan.nextLine();
            checkPassword(password);
        }
    }

    public static boolean checkPassword(String password)
    {
        // Flags
        boolean hasUpper = false; boolean hasLower = false; boolean hasDigit = false;
        int numberUpper = 0; int numberLower = 0;
        // Character to be checked
        char c;

        for (int i = 0; i < password.length(); i++)
        {
           c = password.charAt(i);
           if(Character.isUpperCase(c))
           {
               numberUpper++;
               if(numberUpper >= 2)
               {
                    hasUpper = true;
               }
           }
           else if(Character.isLowerCase(c))
           {
                numberLower++;
                if(numberLower >= 3)
                {
                    hasLower = true;
                }
           }
           else if(Character.isDigit(c))
                hasDigit = true;

        }
        if(hasUpper && hasLower && hasDigit)
        {
            System.out.println("Valid password");
            validPassword = true;
             return true;
        }
       else
       {
         System.out.print("Invalid password. ");
         if(numberUpper < 2)
            System.out.println("It has less than 2 uppercase letters. ");

         if(numberLower < 3)
             System.out.println("It hass less than 3 uppercase letters. ");

         if(!hasDigit)
             System.out.println("It doesn't contain a digit. ");
       }

        return false;
    }
}
