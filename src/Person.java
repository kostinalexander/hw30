import javax.naming.directory.AttributeInUseException;

public class Person {
    private static String login;
    private static String password;
    private static String confirmPassword;


    public static void sinopsisBy(String login, String password, String confirmPassword) {
        char[] pasMas = login.toCharArray();
        for (int i = 0; i < pasMas.length; i++) {
            if (!(pasMas[i] >= 'A' && pasMas[i] <= 'Z') && !(pasMas[i] >= 'a' && pasMas[i] <= 'z') && !(pasMas[i] >= '0' && pasMas[i] <= '9') && !(pasMas[i] == '_')) {
                System.out.println(pasMas[i] + " - ошибочный символ в логине, используйте только латинский алфавит, цифры и знак _");
                throw new WrongLoginException();
            }
        }
        if (login.length() > 20) {
            System.out.println("Логин должен содержать менее 20 символов");
            throw new WrongLoginException();
        }
        char[] pasWor = password.toCharArray();
        for (int i = 0; i < pasMas.length; i++) {
            if (!(pasWor[i] >= 'A' && pasWor[i] <= 'Z') && !(pasWor[i] >= 'a' && pasWor[i] <= 'z') && !(pasWor[i] >= '0' && pasWor[i] <= '9') && !(pasWor[i] == '_')) {
                System.out.println(pasMas[i] + " - ошибочный символ в пароле, используйте только латинский алфавит, цифры и знак _");
                throw new WrongPasswordException();
            }
        }
        if (password.length() > 20) {
            System.out.println("Пароль содержит меньше 20 символов");
            throw new WrongPasswordException();
        }
        if (confirmPassword.length() != password.length()) {
            System.out.println("Пароли должны быть равны");
            throw new WrongPasswordException();
        } else {
            System.out.println(true);
        }
    }
}

