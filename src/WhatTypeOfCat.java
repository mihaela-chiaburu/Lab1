import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WhatTypeOfCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] typeCat = new int[4];
        System.out.println("\n\n------------------------------^._.^ฅ-------------------------------");
        System.out.println("\n\tHello traveler! I want to give you a test, which type of cat are you?");
        System.out.println("\tPlease, answer the following questions\n");
        System.out.println("---------------------------/ᐠ - ˕ -マ-------------------------------\n");
        String[] questions = {
                "1.What's your favorite way to spend a lazy afternoon?",
                "2.How do you react when someone enters your personal space?",
                "3.What type of food do you prefer?",
                "4.How would you describe your social interactions?",
                "5.What's your ideal living environment?",
                "6.How do you handle challenges or obstacles?",
                "7.Which word describes you best?",
                "8.What's your preferred method of communication?",
                "9.What's your favorite cat meme?",
                "10.What's your idea of a perfect day?"
        };
        String[] answers = {
                "a) Napping in a sunny spot\n" +
                        "b) Exploring new places\n" +
                        "c) Playing with toys\n" +
                        "d) Cuddling with a loved one",
                "a) Greet them with curiosity\n" +
                        "b) Maintain your distance but observe them\n" +
                        "c) Playfully pounce on them\n" +
                        "d) Welcome them with affection",
                "a) Anything delicious and gourmet\n" +
                        "b) Freshly caught seafood\n" +
                        "c) Tasty treats and snacks\n" +
                        "d) Home-cooked comfort food",
                "a) Sociable and friendly\n" +
                        "b) Independent and observant\n" +
                        "c) Energetic and playful\n" +
                        "d) Affectionate and loving",
                "a) A cozy home with lots of sunbeams\n" +
                        "b) A spacious outdoor area to explore\n" +
                        "c) A house filled with toys and entertainment\n" +
                        "d) Anywhere as long as there's someone to love",
                "a) Analyze and find a creative solution\n" +
                        "b) Patiently observe and wait for the right moment\n" +
                        "c) Approach with enthusiasm and determination\n" +
                        "d) Seek comfort and support from loved ones",
                "a) Elegant\n" +
                        "b) Mysterious\n" +
                        "c) Playful\n" +
                        "d) Loving",
                "a) Chirping and purring\n" +
                        "b) Silent but watchful\n" +
                        "c) Meowing and chattering\n" +
                        "d) Nuzzling and cuddling",
                "a) Happy Happy Happy cat\n" +
                        "b) Polite cat\n" +
                        "c) Smudge the cat\n" +
                        "d) Banana cat",
                "a) A gourmet meal followed by a nap\n" +
                        "b) Exploring new places and experiences\n" +
                        "c) Non-stop playtime with friends\n" +
                        "d) Spending quality time with loved ones"
        };
        for (int i = 0; i < 10; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
            System.out.print("Enter your choice (a/b/c/d): ");
            String choice = userChoice(scanner);
            System.out.println();

            switch (choice) {
                case "a":
                    typeCat[0]++;
                    break;
                case "b":
                    typeCat[1]++;
                    break;
                case "c":
                    typeCat[2]++;
                    break;
                case "d":
                    typeCat[3]++;
                    break;
            }
        }

        int maxScoreIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (typeCat[i] > typeCat[maxScoreIndex]) {
                maxScoreIndex = i;
            }
        }

        List<String> whatCat = new ArrayList<>();
        whatCat.add("sophisticated and elegant cat");
        whatCat.add("independent and adventurous cat");
        whatCat.add("playful and energetic cat");
        whatCat.add("loving and affectionate cat");

        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("\tYou are a " + whatCat.get(maxScoreIndex) + "!!! ≽^•⩊•^≼");
        System.out.println("---------------------------------------------------------------------");
    }

    private static String userChoice(Scanner scanner) {
        String choice = "";
        try {
            choice = scanner.nextLine();
            while (!choice.matches("[a-d]")) {
                System.out.print("Invalid choice. Please enter a valid choice (a/b/c/d): ");
                choice = userChoice(scanner);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while reading your input.");
            scanner.nextLine();
        }
        return choice;
    }
}