
import java.util.*;
import java.util.regex.*;

public class SimpleChatbot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Define patterns and responses
        String[][] pairs = {
            {"hi|hello|hey",
                "Hey there!|Hello!|Hi, how can I help you?"},
            {"what is your name\\??",
                "I'm a chatbot, but you can call me Bob."},
            {"sup|wassup|supp|yo!|how are you\\??",
                "I'm just code, but thanks for asking!|Doing great in binary."},
            {".*your favorite.*",
                "I don't have preferences, but I like your curiosity."},
            {"bye|exit|quit",
                "Goodbye! Have a great day.|See ya! Come back soon."},
	          {"Who made you?",
		            "Mariam F|A girl named 'Mariam Fatima'"},
 	          {"Who invented pizza?",
		            "The Italians!"},
	          {"Yes|yes|YES|yesss|yea|YEA|Yea|yeaa",
		            "Woah cool!|That's cool|Chill|chill chill"},
            {".*",
                "Tell me more.|Why do you say that?|Interesting... go on."}
        };

        System.out.println(
            "Hi! I'm a simple chatbot. Type 'quit' to exit."
        );

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase().trim();

            if (input.equals("quit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            boolean matched = false;

            for (String[] pair : pairs) {
                Pattern pattern = Pattern.compile(
                    pair[0], Pattern.CASE_INSENSITIVE
                );
                Matcher matcher = pattern.matcher(input);

                if (matcher.find()) {
                    String[] responses = pair[1].split("\\|");
                    System.out.println(
                        "Chatbot: " +
                        responses[random.nextInt(responses.length)]
                    );
                    matched = true;
                    break;
                }
            }
        }

        sc.close();
    }
}
