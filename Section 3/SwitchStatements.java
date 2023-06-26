public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch
        switch (weather) {
            case "sunny":
                System.out.println("It's sunny");
                break;
            case "cloudy":
                System.out.println("It's cloudy");
                break;
            case "rainy":
                System.out.println("It's rainy");
                break;
            case "snowy":
                System.out.println("It's snowy");
                break;
            default:
                System.out.println("Wear whatever you want");
                break;
        }

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        switch (role) {
            case 1:
                System.out.println("admin");
                break;
            case 2:
                System.out.println("editor");
                break;
            case 3:
                System.out.println("user");
                break;
            default:
                break;
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        if(temperature >= 80 && humidity >= 60) {
            System.out.println("It's too hot and humid");
        } else if (temperature >= 60) {
            System.out.println("It's too hot");
        } else {
            System.out.println("It's too comfortable");
        }

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if (age >= 25 && income >= 40000) {
            System.out.println("You are eligable");
        } else {
            System.out.println("You are not eligable");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        switch(lightColor) {
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Slow");
                break;
            case "red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("Power Outage");
                break;
        }

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        if (grade >= 80) {
            System.out.println("You got an A!");
        } else if (grade >= 70) {
            System.out.println("You got a B!");
        } else if (grade >= 60) {
            System.out.println("You got a C.");
        } else if (grade >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You failed :(");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        switch (browser) {
            case "Chrome":
                System.out.println("Chrome");
                break;
            case "Firefox":
                System.out.println("Firefox");
                break;
             case "Safari":
                System.out.println("Safari");
                break;
            case "Edge":
                System.out.println("Edge");
                break;
            case "Opera":
                System.out.println("Opera");
                break;
            default:
                System.out.println("What are you using? Internet Explorer?");
                break;
        }
        

    }
}
