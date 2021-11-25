import java.util.Scanner;

public class ReviewQuizWithExceptions
{
    //Providing options to answer with
enum Options{A, B, C, D, a, b, c, d};

//the questions
private static String[] reviewQuestions =
{
    "\n1.In object-oriented programming terminology, an unexpected or error condition is a(n) .\na. anomaly\nb. aberration\nc. deviation\nd. exception\n",

    "\n2. All Java Exceptions are .\na. Errors\nb. RuntimeExceptions\nc. Throwables\nd. Omissions\n",

    "\n3. Which of the following statements is true? \na. Exceptions are more serious than Errors. \nb. Errors are more serious than Exceptions. \nc. Errors and Exceptions are equally serious. \nd. Exceptions and Errors are the same thing.",
    
    "\n4. The method that ends the current application and returns control to the operating system is .\na. System.end()\nb. System.done()\nc. System.exit()\nd. System.abort()",

    "\n5. In object-oriented terminology, you a procedure that might not complete correctly.\na. try\nb. catch\nc. handle\nd. encapsulate\n",

    "\n6. A method that detects an error condition or Exception an Exception.\na. throws\nb. catches\nc. handles\nd. encapsulates",

    "\n7. A try block includes all of the following elements except .\na. the keyword try\nb. the keyword catch\nc. curly braces\nd. statements that might cause Exceptions",

    "\n8. The segment of code that handles or takes appropriate action following an exception is a block.\na. try\nb. catch\nc. throws\nd. handles",

    "\n9. You within a try block.\na. must place only a single statement\nb. can place any number of statements\nc. must place at least two statements\nd. must place a catch block",

    "\n10. If you include three statements in a try block and follow the block with three catch blocks, and the second statement in the try block throws an Exception, then .\na. the first catch block executes\nb. the first two catch blocks execute\nc. only the second catch block executes\nd. the first matching catch block executes"
};
//the answers
private static String[] answers = {
    "D",
    
    "C",

    "B",

    "C",

    "A",

    "A",

    "B",

    "B",

    "B",

    "D"
};
//Main method
public static void main(String[] args)
{
    int rightAnswers = 0;

    Scanner input = new Scanner(System.in);

    Options userOption;

    boolean isTrueOption = false;
    //question accretion
    for(int i = 0; i < 10; i++)
    {
        System.out.println("\nPlease select A, B, C, or D:\n" + reviewQuestions[i]);
        
        do
        {
            try
            {
                //User answer + converting it to uppercase to make answers easier
                String userinput = input.nextLine().toUpperCase();
                userOption = Options.valueOf(userinput);
                isTrueOption = true;
                //record correct answers and display if it was correct
                if(answers[i].equals(userinput))
                {
                    rightAnswers++;
                    System.out.println("\nCorrect\n");
                }
                //display answer if it was wrong
                else
                {
                    System.out.println("\nIncorrect the answer is: " + answers[i]);
                }
            }

            //looking for invalid input: (exceptions are cool)
            catch(IllegalArgumentException ex)
            {
                System.out.println("\nInvalid entry, Please try again.\nPlease Enter A, B, C, or D\n" + reviewQuestions[i]);
            }
        }
        while(!isTrueOption);
        isTrueOption = false;
    }
    //Correct answer amount
    System.out.println("\nTotal answers answered correctly: " + rightAnswers);
}
}
    

