import java.util.Scanner;

public class ATM {
// bütün işlemlerimizi bu metod içnde gerçekleştireceğiz

    public void work(Hesap hesap) {
// burda girişi kontrol edeceğimiz için bir Login sınıfından login nesnesi oluşturacağız
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our bank");
        System.out.println("*******************************");
        System.out.println("User Login ");
        System.out.println("*******************************");

        int right_entry = 3;

        while (true)
        {
            if (login.login(hesap)){
                System.out.println("Login successful");
                break;
//login nesnesi login metodunu çalıştırdı hesap sınıfından gelen hesap nesnesi ile

//burda bizim work metodu içine gönderdiğimiz hesap nesnesi bu sefer login metodu ile login metoduna gönderilecek

            }
            else {
                System.out.println("Login failed");
                right_entry -= 1;
                System.out.println("Remainder right of entery : " + right_entry);

            }
            if(right_entry==0){
                System.out.println("Your right of entry has expired");

                return;
            }

        }

        System.out.println("*******************************");
        String menu = "1- View Balance \n" +
                    "2- Deposit \n" +
                    "3- Withdraw Money \n"+
                    "Press q to exit";
        System.out.println(menu);
        System.out.println("*******************************");


        while(true){
            System.out.print("Select : ");
            String select = scanner.nextLine();

            if (select.equals("q")){
                break;
            }
            else if (select.equals("1"))
            {
                System.out.println("Your Balance : " + hesap.getBalance());
            }
            else if (select.equals("2"))
            {
                System.out.print("Amount you want to deposit : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.deposit(amount);
                System.out.println("Your new balance : " + hesap.getBalance());
            }
            else if (select.equals("3"))
            {
                System.out.print("Amount you want to withdraw : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.withdrawMoney(amount);
                System.out.println("Your new balance : " + hesap.getBalance());
            }
            else
            {
                System.out.println("Invalid select");
            }
        }



    }

}

