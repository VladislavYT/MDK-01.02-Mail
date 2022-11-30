import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        System.out.printf("\nВведите логин ");
        String login = in.nextLine();

        System.out.printf("\nВведите пароль: ");
        String password = in.nextLine();

        System.out.printf("\nВведите ваш email: ");
        String email = in.nextLine();

        String code = String.valueOf(r.nextInt(1000));
        SSLEmail.send(email,"Ваш код",code);

        System.out.printf("\nВведите код из вашей почты: ");
        String authcode = in.nextLine();

        if (authcode.equals(code)){
            System.out.printf("\nАккаунт создан: %s\t%s",login,password);
        }
        else{
            System.out.println("Неверный код");
        }
    }
}