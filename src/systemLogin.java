import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class systemLogin {

    public static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        String username = "yazan";
        String password = "124321";
        String filepath = "shuBre.txt";

        username.toLowerCase();


        checkLogin(username, password, filepath);

    }

    public static void checkLogin(String username, String password, String filepath)  {

        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";

        try{
             scanner = new Scanner(new File(filepath));
             scanner.useDelimiter("[,\n]");

             while(scanner.hasNext() && !found){
                 tempUsername= scanner.next();
                 tempPassword = scanner.next();

                 if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                     found = true;

                 }
             }
             scanner.close();
            System.out.println(found);
        }catch (Exception e ) {
            System.out.println("Error: " + e);
        }

    }
}
