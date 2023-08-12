import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword;
        String name = "patika", sifre ="java123";
        int karar;

        Scanner in = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = in.nextLine();

        System.out.print("Kullanıcı Şifreniz : ");
        password = in.nextLine();

        if(userName.equals(name)&& password.equals(sifre)){
            System.out.println("Giriş Yaptınız !");
        }else if(userName.equals(name)){
            System.out.println("Şifreniz Yanlış !!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz?\n 1-Evet\n2-Hayır");
            karar = in.nextInt();

            switch (karar){
                case 1:
                    System.out.print("Yeni Kullanıcı Şifreniz : ");
                    newPassword = in.nextLine();

                    if(newPassword.equals(sifre)){
                        System.out.println( "Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else {
                        System.out.println("Şifre oluşturuldu");
                        break;
                    }
                case 2:
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
                break;
            }

        }}}

