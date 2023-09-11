import java.util.Scanner;

public class Login {
// kullanıcı girişini kontrol etmek için login girişi yazıcam
// login metoduna hesap nesnesi göndereceğiz giriş kontrolu için
    public boolean login(Hesap hesap){

        Scanner scanner = new Scanner(System.in);
        String user_name;
        String password;

        System.out.print("Enter your user name : ");
        user_name=scanner.nextLine();
        System.out.print("Enter your password : ");
        password=scanner.nextLine();

        //burdaki adı ve şifreyi hesap sınıfındaki ad ve şifreyle kıyaslamalıyım artık

        if(hesap.getUser_name().equals(user_name) && hesap.getPassword().equals(password))
        {
            System.out.println("Your user name and password are correct !");
            return true;
        }
        else if(hesap.getUser_name().equals(user_name) && !hesap.getPassword().equals(password))
        {
            System.out.println("Your user name is correct but  password is incorrect !");
            return false;
        }
        else if (!hesap.getUser_name().equals(user_name) && hesap.getPassword().equals(password))
        {
            System.out.println("Your user name or password are incorrect !");
            return  false;
        }
        else
        {
            return false;
        }


    }

}
