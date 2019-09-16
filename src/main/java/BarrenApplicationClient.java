import BarrenException.InValidInputException;
import BarrenService.BarrenFertileLandImpl;
import BarrenService.BarrenFertileLandParser;

import java.util.Scanner;


/**
 * @author Varadharajan on 2019-09-16 20:54
 * @project name: barren-land
 */
public class BarrenApplicationClient {

    public static void main(String[] args) {

        BarrenFertileLandParser barrenFertileLand = new BarrenFertileLandImpl();

        Scanner sc = new Scanner(System.in);
        try {
            int value = Integer.valueOf(sc.nextLine());

            //press enter after entering value
            String[] input = new String[value];

            for (int i = 0; i < value; i++) {
                //press enter after values. seaprated by space
                input[i] = sc.nextLine();
            }

            //String[] input = {“48 192 351 207”, “48 392 351 407”, “120 52 135 547”, “260 52 275 547”};

            //String[] input = {"0 292 399 307"};

            String output = barrenFertileLand.parseFertileFoundLand(input);
            System.out.println(output);
        } catch (Exception e) {
            throw new InValidInputException("given input is invalid");
        }


    }


}
