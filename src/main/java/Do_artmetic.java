import java.util.InvalidPropertiesFormatException;

import static java.lang.System.exit;

public class Do_artmetic implements Methods{

    public void Sum(String[] array, int size)
    {
        try {
            double sum = 0;
            for (int i = 0; i < size; i++) {
                sum = Double.parseDouble(array[i]) + sum;
            }
            System.out.println("Suma wynosi: " + sum);
        }
        catch(Exception e)
        {
            System.out.println("Zly format danych wylaczam program");
            exit(0);
        }
    }

    public void Minus(String[] array, int size) {
        try {
            double minus = 0;
            for (int i = 0; i < size; i++) {
                minus = Double.parseDouble( array[i] ) - minus;
            }
            System.out.println("Roznica wynosi: "+  minus);
        }
        catch(Exception e)
        {
            System.out.println("Zly format danych wylaczam program");
            exit(0);
        }
    }

    public void Multi(String[] array, int size) {
        try {
            double mult = Double.parseDouble( array[0] );
            for (int i = 1; i < size; i++) {
                mult = Double.parseDouble( array[i] ) * mult;
            }
            System.out.println("Mnozenie wynosi: "+  mult);
        }
        catch(Exception e)
        {
            System.out.println("Zly format danych wylaczam program");
            exit(0);
        }
    }

    public void Divide(String[] array, int size) {
        try {
            double divide = Double.parseDouble( array[0] );
            for (int i = 1; i < size; i++) {
                divide = divide/Double.parseDouble( array[i] ) ;
            }
            System.out.println("Dzielenie wynosi: "+  divide);
        }
        catch(Exception e)
        {
            System.out.println("Zly format danych wylaczam program");
            exit(0);
        }
    }
}
