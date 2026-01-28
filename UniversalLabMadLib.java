import java.util.Scanner;

public class UniversalLabMadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the goal of the experiment: ");
        String goal = input.nextLine();

        System.out.print("Enter the primary system studied: ");
        String system1 = input.nextLine();

        System.out.print("Was there a second system? (yes/no): ");
        boolean hasSecondSystem = input.nextLine().equalsIgnoreCase("yes");

        String system2 = "";
        if (hasSecondSystem) {
            System.out.print("Enter the second system: ");
            system2 = input.nextLine();
        }

        System.out.print("Enter the main equation used: ");
        String equation1 = input.nextLine();

        String equation2 = "";
        if (hasSecondSystem) {
            System.out.print("Enter the second equation used: ");
            equation2 = input.nextLine();
        }

        System.out.print("Did a variable have an effect on the results? (yes/no): ");
        boolean hadEffect = input.nextLine().equalsIgnoreCase("yes");

        String variable = "";
        String effectDescription = "";

        if (hadEffect) {
            System.out.print("Enter the variable that had an effect: ");
            variable = input.nextLine();

            System.out.print("Describe how it affected the results: ");
            effectDescription = input.nextLine();
        }

        System.out.print("Enter a source of error (or type none): ");
        String error1 = input.nextLine();

        System.out.print("Enter another source of error (or type none): ");
        String error2 = input.nextLine();

        System.out.println("\n--- Mad Lib Result ---\n");

        // Goal statement (verb already included)
        System.out.println("The goal of this experiment was to " + goal + ".");

        // System logic
        if (hasSecondSystem) {
            System.out.println("The experiment examined both the " + system1 +
                    " and the " + system2 + " systems.");
            System.out.println("The results supported the equations " +
                    equation1 + " and " + equation2 + ".");
        } else {
            System.out.println("The experiment focused on the " + system1 + " system.");
            System.out.println("The results supported the equation " + equation1 + ".");
        }

        // Effect logic (completely optional)
        if (hadEffect) {
            System.out.println("The data showed that " + variable +
                    " affected the results, " + effectDescription + ".");
        } else {
            System.out.println("The data showed that no tested variables had a measurable effect on the results.");
        }

        // Error logic
        if (error1.equalsIgnoreCase("none") && error2.equalsIgnoreCase("none")) {
            System.out.println("No significant sources of experimental error were identified.");
        } else {
            System.out.print("Possible sources of error included ");

            boolean printedSomething = false;

            if (!error1.equalsIgnoreCase("none")) {
                System.out.print(error1);
                printedSomething = true;
            }

            if (!error2.equalsIgnoreCase("none")) {
                if (printedSomething) {
                    System.out.print(" and ");
                }
                System.out.print(error2);
            }

            System.out.println(".");
        }

        System.out.println("Overall, the data and calculations were consistent with the expected outcomes.");

        input.close();
    }
}
