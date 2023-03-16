import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Codivate_Final_Project
{
    public static void main(String[] args)
    {
        System.out.print("\nWelcome to CodiQuiz!\n" +
                "--------------------\n\n");

        Scanner input = new Scanner(System.in);

        System.out.print("How many questions would you like? (maximum of 12) ==> ");
        int currentQuestions = input.nextInt();

        while(!((currentQuestions >= 1) && (currentQuestions <= 12)))
        {
            System.out.print("\nSorry, that's not allowed.\nPlease pick a number of questions between 1 and 12, inclusive ==> ");

            currentQuestions = input.nextInt();
        }

        System.out.println();

        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();

        questions.add("[QUESTION 1]");
        answers.add("[ANSWER to Q1]");

        questions.add("[QUESTION 2]");
        answers.add("[ANSWER to Q2]");

        questions.add("[QUESTION 3]");
        answers.add("[ANSWER to Q3]");

        questions.add("[QUESTION 4]");
        answers.add("[ANSWER to Q4]");

        questions.add("[QUESTION 5]");
        answers.add("[ANSWER to Q5]");

        questions.add("[QUESTION 6]");
        answers.add("[ANSWER to Q6]");

        questions.add("[QUESTION 7]");
        answers.add("[ANSWER to Q7]");

        questions.add("[QUESTION 8]");
        answers.add("[ANSWER to Q8]");

        questions.add("[QUESTION 9]");
        answers.add("[ANSWER to Q9]");

        questions.add("[QUESTION 10]");
        answers.add("[ANSWER to Q10]");

        questions.add("[QUESTION 11]");
        answers.add("[ANSWER to Q11]");

        questions.add("[QUESTION 12]");
        answers.add("[ANSWER to Q12]");

        int numCorrect = 0;
        int questionIndex = 0;
        int numQuestions = currentQuestions;
        String answer = "";

        Random random = new Random();

        input.nextLine();

        while(currentQuestions > 0)
        {
            questionIndex = random.nextInt(questions.size());

            System.out.print("\n\n" + questions.get(questionIndex) +
                    "\nType your answer here ==> ");
            answer = input.nextLine();

            if(answer.equals(answers.get(questionIndex)))
                numCorrect++;

            questions.remove(questionIndex);
            answers.remove(questionIndex);

            currentQuestions--;
        }

        int score = (int)(((numCorrect * 1.0) / numQuestions) * 100);

        if(score > 85)
            System.out.print("\n\nWow, awesome job! You got a " + numCorrect + "/" + numQuestions + ".");

        else if(score > 65)
            System.out.print("\n\nNice job. You got a " + numCorrect + "/" + numQuestions + ".");

        else
            System.out.print("\n\nUh oh...you got a " + numCorrect + "/" + numQuestions + "." + "\nBetter luck next time!");

        System.out.print("\n\n");
    }
}