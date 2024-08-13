import java.util.Scanner;
import java.util.Random;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Computer Science Department ChatBot!");
        System.out.println("You can ask about our faculty, courses, research, general information, and more.");

        while (true) {
            try {
                System.out.print("You: ");
                String userMessage = scanner.nextLine();

                if (userMessage.equals("bye")) {
                    System.out.println("CS Chatbot: Goodbye! If you have more questions, feel free to ask.");
                    break;
                } else {
                    String response = generateResponse(userMessage);
                    System.out.println("CS Chatbot: " + response);
                }
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static String generateResponse(String userMessage) {
        // Implement logic for generating responses based on user input

        if (userMessage.contains("course")) {
            return "We offer the following courses: Java Programming, Algorithms. Which course are you interested in?";
        } else if (userMessage.contains("faculty") || userMessage.contains("professor")) {
            return "Our faculty includes the following professors: Professor A, Professor B. Whom would you like to know more about?";
        } else if (userMessage.contains("java")) {
            return "Java Programming is an introductory course covering the basics of Java.";
        } else if (userMessage.contains("algorithms")) {
            return "Algorithms and Data Structures explores fundamental algorithms and data structures.";
        } else if (userMessage.contains("Professor A") || userMessage.contains("Professor a")) {
            return "Professor A specializes in software engineering and has a Ph.D. in Computer Science. You can ask about specific research areas, projects, or publications related to Professor A.";
        } else if (userMessage.contains("Professor B") || userMessage.contains("Professor b")) {
            return "Professor B is an expert in artificial intelligence and machine learning. Feel free to inquire about ongoing research or recent publications.";
        } else if (userMessage.contains("research")) {
            return "Our department is involved in various research areas, including artificial intelligence, machine learning, software engineering, and algorithms.";
        } else if (userMessage.contains("joke")) {
            return getRandomJoke();
        } else if (userMessage.contains("admission")) {
            return "For information on admissions, please visit our department's website or contact the admission office.";
        } else if (userMessage.contains("graduation")) {
            return "To graduate, you must complete the required courses and meet the graduation requirements. Consult with your academic advisor for specific details.";
        } else if (userMessage.contains("office hours")) {
            return "Office hours for faculty members vary. You can check the department's website or contact the faculty directly for their office hours.";
        } else if (userMessage.contains("technology") || userMessage.contains("programming languages")) {
            return "We use a variety of technologies including Java, Python, C++, and frameworks such as Spring and Django.";
        } else if (userMessage.contains("event") || userMessage.contains("workshop") || userMessage.contains("conference")) {
            return "We regularly organize events, workshops, and conferences. Check our department's website for upcoming events.";
        } else if (userMessage.contains("internship") || userMessage.contains("internship opportunities")) {
            return "We collaborate with various companies to provide internship opportunities for our students. Check with the career services office for current openings.";
        } else if (userMessage.contains("capstone project") || userMessage.contains("final year project")) {
            return "Our students engage in exciting capstone projects in areas like artificial intelligence, data science, and software development.";
        } else if (userMessage.contains("coding competition") || userMessage.contains("hackathon")) {
            return "We encourage students to participate in coding competitions and hackathons. Stay tuned for announcements.";
        } else if (userMessage.contains("student organization") || userMessage.contains("club")) {
            return "We have several active student organizations related to computer science. Explore opportunities to join and engage with like-minded peers.";
        } else {
            return "I'm sorry, I didn't understand that. Please ask about courses, faculty, research, or general information.";
        }
    }

    private static String getRandomJoke() {
        // Add more jokes or use an external API for a wider variety
        String[] jokes = {
                "Why don't programmers like nature? It has too many bugs!",
                "Why did the computer cross the road? To get to the other website!",
                "How many programmers does it take to change a light bulb? None. That's a hardware problem."
        };

        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
