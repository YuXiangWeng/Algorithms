import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Numbers.txt");
        Scanner s = new Scanner(f);
        int odds = odds();
        int evens = evens();
        System.out.println("number of odds : " + odds);
        System.out.println("number of evens : " + evens);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()){
            if (s.nextInt()%2 == 0)
            evens ++;
        }
        return evens;
    }

    public static int doubleDigits() throws FileNotFoundException{
        s = new Scanner(f);
        int doubleDigits = 0;
        while (s.hasNext()){
            if(s.nextInt()>=10 && s.nextInt()<100)
            doubleDigits ++;
        }
        return doubleDigits;
    }
    public static int moreThanFiveHundred () throws FileNotFoundException{
        s = new Scanner(f);
        int moreThanFiveHundred = 0;
        while (s.hasNext()){
            if (s.nextInt()>500){
                moreThanFiveHundred ++;
            }
        }
        return moreThanFiveHundred;
    }

        
}