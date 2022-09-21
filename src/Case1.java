import java.sql.SQLOutput;
import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć, jak masz na imię? ");
        String name = scanner.next();
        System.out.println("Nazwisko? ");
        String surname = scanner.next();
        System.out.println("Ile masz lat? Bo jakoś tak młodo wyglądasz... ");
        int age = scanner.nextInt();
        if (age < 18)
        {
            System.out.println("Przykro mi, ale nie mogę Cię wpuścić " +name +surname);
        }
        else if (age >= 18 && age <= 25) {
            System.out.print("Zapraszam " + name + surname);
            System.out.println(" ,miłej zabawy 18-25!");
            System.out.println("Masz darmowe piwo! ");
            String[] names=new String[] {"Ania", "Kasia", "Stefan", "Jan", "Wojtek"};
            for (int i = 0; i < names.length; i++) {
                if (name.equals(names[i])) {
                    System.out.print(names[i]);
                    System.out.println(" dostajesz shota, gratulacje! ");
                }
            }
        }
        else if (age > 90)
        {
            System.out.print("Zapraszam "+name +surname);
            System.out.println(" ,miłej zabawy!");

        }
        else if (age > 99)
        {
            System.out.println("Aby na pewno...?");
        }
    }
}