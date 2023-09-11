public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Hesap hesap=new Hesap("Sait Demirel" , "123" , 4500000);
// yukarıda oluşturduğumuz objeyi çalışa göndericeğiz ve çalış metodundaki nesnetye eşitlemiş olacağız
        atm.work(hesap);

    }
}