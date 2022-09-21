import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names=new String[] {"Ania", "Kasia", "Stefan", "Jan", "Wojtek"};
        System.out.println("Hello, what is your name? ");
        String name = scanner.next();
        System.out.println("...and what is your surname? ");
        String surname = scanner.next();
        System.out.println("How old are you? You look so young... ");
        int age = scanner.nextInt();
        if (age < 18)
        {
            System.out.println("Unfortunately, you can not enter to the club " + name + " "+ surname);
        }
        else if (age >= 18 && age <= 25) {
            System.out.print("Welcome " + name + " " + surname);
            System.out.println(" ,have a good party !");
            System.out.println("You get free beer! ");
            for (int i = 0; i < names.length; i++) {
                if (name.equals(names[i])) {
                    System.out.print(names[i]);
                    System.out.println(" you have a free shot! ");
                }
            }
        }
        else if (age >= 30 && age <= 40) {
            System.out.print("Welcome " + name + surname);
            System.out.println(" ,have a good party !");
            for (int i = 0; i < names.length; i++) {
                if (name.equals(names[i])) {
                    System.out.print(names[i]);
                    System.out.println(" Please, go to the VIP room. ");
                }
            }
        }

        else if (age > 40)
        {
            System.out.println("Welcome " +name+ " " +surname+ "You can enter to the club !");
        }
    }
}