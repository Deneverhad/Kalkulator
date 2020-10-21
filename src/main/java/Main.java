import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args)
    {
        int wybor = 0;
        System.out.println("Witaj w Kalkukatorze");
        Panel();
        Scanner scan = new Scanner(System.in);
        String Choose = scan.next();
        List<String> NumbersList= new ArrayList();
        NumbersList = List();

        String[] numbers = NumbersList.toArray( new String[] {} );
        try {
            wybor = Integer.parseInt(Choose);
        }
        catch (Exception e){
            System.out.println("Zla dana");
            exit(0);
        }
        Do_artmetic body = new Do_artmetic();

        switch(wybor)
        {
            case 1: body.Sum(numbers,NumbersList.size());  break;
            case 2: body.Minus(numbers,NumbersList.size());  break;
            case 3: body.Multi(numbers,NumbersList.size());  break;
            case 4: body.Divide(numbers,NumbersList.size());  break;
        }

    }
    public static void Panel()
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
        if(Numbers.get(0).equals("q")) exit(0);

        while (!(Numbers.get(i).equals("q")))
        {
            Numbers.add(scan.next());
            i++;
        }
        Numbers.remove(i);

        return Numbers;
    }
    public static void View()
    {
        System.out.println("That the change");
    }


}
