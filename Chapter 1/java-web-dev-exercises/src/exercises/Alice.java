package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String bookExcerpt = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String textToSearch = bookExcerpt.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("What text are you looking for?");
        String initialResponse = input.nextLine();
        String response = initialResponse.toLowerCase();

        input.close();
//        System.out.println(response);

        boolean textPresent = textToSearch.contains(response);
//        System.out.println(textPresent);

        if (textPresent) {
            System.out.println("Your text was found in the first sentence of Alice in Wonderland.");

            int foundIndex = textToSearch.indexOf(response);
            System.out.println("Your text was found at index: " + foundIndex);
            System.out.println("The length of your text is " + response.length());

            String responseRemoved = bookExcerpt.replace(initialResponse, "");
            System.out.println(responseRemoved);
        } else {
            System.out.println("Your text was NOT found in the first sentence of Alice in Wonderland.");
        }

    }

}
