import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Welcome to my shop!");
        System.out.println("please type your age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("Your age is " + age + " years old.");

        System.out.println("#####****  LIQUOR  SHOP  ****####");

        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Beer", 25, 4.7));
        drinks.add(new Drink("Orange Juice", 66, 0.0));
        drinks.add(new Drink("Vodka", 140, 41));

        for (int i = 0; i < drinks.size(); i++) {
            Drink current = drinks.get(i);
            if(age < 16) {

                System.out.println(current);
            }
            else if (age < 18 && current.getAlcPercentage()>= 0 && current.getAlcPercentage()<16.5) {
                System.out.println(current);
            } else if (age >= 18) {
                System.out.println(current);
            }

        }



//         for (Drink current : drinks) {
//            if (age > 15 && current.getAlcPercentage() >= 16.5) {
//                System.out.println(current);
//            } else {
//                System.out.println(current);
//            }
//
//        }


        /*
        if(age>15 && alc < 16.5)
            System.out.println(beer);
        System.out.println(orangeJuice);
*/

    }
}