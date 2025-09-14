import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İstifədəçi adını daxil edin: ");
        String username = scanner.nextLine();
        System.out.print("Istifadəçi parolunu qeyd edin: ");
        String password = scanner.nextLine();
        while (true){
            System.out.print("Istifadəçinin parolunu təkrar daxil edin: ");
            String repassword = scanner.nextLine();
            if (repassword.equals(password)){
                break;
            }
        }
        while (true){
            System.out.print("Adı: ");
            String USERNAME = scanner.nextLine();
            System.out.print("Passwordu: ");
            String  PASSWORD = scanner.nextLine();
            if (USERNAME.equals(username) && PASSWORD.equals(password)){
                System.out.print("Hesaba daxil oldunuz: ");
                break;
            }
            else {
                System.out.println("Hesab məlumatları doğru deyil!! ");
            }
        }

    }
}

