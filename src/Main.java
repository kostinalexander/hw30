

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.sinopsisBy("egorr", "azekazek", "azekazek");
        } catch (WrongLoginException e) {
            System.out.println("неправильные данные");
        } catch (WrongPasswordException l) {
            System.out.println("данные неверны");
        }

    }
}