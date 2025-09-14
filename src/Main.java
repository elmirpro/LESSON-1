import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İstifədəçi adını daxil edin: ");
        String username = scanner.nextLine();
        System.out.print("İstifadəçi parolunu qeyd edin: ");
        String password = scanner.nextLine();
        while (true) {
            System.out.print("Istifadəçinin parolunu təkrar daxil edin: ");
            String repassword = scanner.nextLine();
            if (repassword.equals(password)) {
                break;
            }
        }
        while (true) {
            System.out.print("Adı: ");
            String loginUsername = scanner.nextLine();
            System.out.print("Passwordu: ");
            String loginPassword = scanner.nextLine();
            if (loginUsername.equals(username) && loginPassword.equals(password)) {
                System.out.print("Hesaba daxil oldunuz: ");
                break;
            } else {
                System.out.println("Hesab məlumatları doğru deyil!! ");
            }
        }

    }
}

