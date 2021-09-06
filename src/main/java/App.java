import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String s = inputString();
            if (isValidPassword(s)==0){
                System.out.println("Mật khẩu yếu");
            } else if(isValidPassword(s)==2){
                System.out.println("Mật khẩu chưa đủ manh ");
            } else System.out.println("Mật khẩu OK");
    }

    public static boolean checkLenghtPassword(String s) {
        if (s.length() < 11) {
            return false;
        }
        return true;
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mật khẩu vào: ");
        String s = sc.nextLine();
        return s;
    }

    public static int isValidPassword(String s) {
        if (checkLenghtPassword(s) == false) {
            return 0;
        } else { if (checkNumberic(s) == true && checkSpecialCharacter(s) == true && checkUpperCase(s) == true) {
                return 1;
            }
            return 2;
        }
    }

    public static boolean checkUpperCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNumberic(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSpecialCharacter(String s) {
        String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String str[] = s.split("");
        for (int i = 0; i < s.length(); i++)
            if (specialCharacters.contains(str[i])) {
                return true;
            }
        return false;
    }
}

