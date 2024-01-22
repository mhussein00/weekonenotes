import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String city = "Columbus";
        int zipCode = 43215;
        double weather[] = {32, 25, 27, 40, 45};
        System.out.println("City: " + city);
        System.out.println("Zipcode: " + zipCode);
        double sum = Arrays.stream(weather).sum()/weather.length;
        System.out.println("Average Temperature: " + sum);

    }
}

