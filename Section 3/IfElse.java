public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if(biologyGrade > chemistryGrade) {
            System.out.println("Yes, you scored better in biology.");
        } else {
            System.out.println("No, you did not better in biology.");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if(sales > costs) {
            System.out.println("Yes, we did make money.");
        } else {
            System.out.println("Yes, we did not make money.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if (temperature < targetTemperature) {
            System.out.println("Yes, the temperature is colder than our target.");
        } else {
            System.out.println("No, the temperature is not colder than our target.");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if (currentSpeed <= speedLimit) {
            System.out.println("Yes, you are driving slower than the speed limit.");
        } else {
            System.out.println("No, you are " + (currentSpeed-speedLimit) + " over the speed limit.");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if (age >= retirementAge) {
            System.out.println("Yes, you are old enough to retire.");
        } else {
            System.out.println("No, you need " + (retirementAge-age) + " years left yo retire.");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if (myGrade == bestGrade) {
            System.out.println("Yes, you got the best possible grade.");
        } else {
            System.out.println("No, you did not get the best possible grade.");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if (word.equals(secondWord)) {
            System.out.println("Yes, the two words the same.");
        } else {
            System.out.println("No, the two words are not the same.");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if (!thirdWord.equals(fourthWord)) {
            System.out.println("Yes, the two words are different.");
        } else {
            System.out.println("No, the two words are not different.");
        }
    }
}
