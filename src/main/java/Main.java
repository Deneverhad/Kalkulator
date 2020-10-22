import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

/*
 *
 * Klasa main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w Kalkukatorze");
        int wybor = 0;
        ShowList();
        Scanner scan = new Scanner(System.in);
        String choose = scan.next();
        List<String> numbersList;
        numbersList = List();

        String[] numbers = numbersList.toArray(new String[] {});
        try {
            wybor = Integer.parseInt(choose); }
        catch (Exception e){
            
            System.out.println("Zla dana");
            exit(0);  }
        Do_artmetic body = new Do_artmetic();

        switch(wybor) {
            case 1: {
                body.Sum(numbers, numbersList.size());
                break;
            }

            case 2: {
                body.Minus(numbers, numbersList.size());
                break;
            }
            case 3: {
                body.Multi(numbers, numbersList.size());
                break;
            }
            case 4: {
                body.Divide(numbers, numbersList.size());
                break;
            }
            default:
        }

    }
    public static void ShowList()
    {
        System.out.println("1. Dodaj");
        System.out.println("2. Odejmij");
        System.out.println("3. Pomnoż");
        System.out.println("4. Podziel");
    }
    public static List<String> List()
    {
        List<String> Numbers = new ArrayList<>();
        int i = 0;
        System.out.println("Podaj liczby do dzialania- aby zakonczyc podaj q:");
        Scanner scan = new Scanner(System.in);
        Numbers.add(scan.next());
        if("q".equals(Numbers.get(0))) exit(0);

        while (!("q".equals(Numbers.get(i)))) {
            Numbers.add(scan.next());
            i++; }
        
        Numbers.remove(i);

        return Numbers;
    }
}
