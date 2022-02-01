//Jonathan Pena
//CS1400
//Assignment4
//November 5, 2021

import java.util.Scanner;

public class TriviaGame 
{
    public static void main(String[] args)
    {

        Scanner keyboard;
        keyboard = new Scanner(System.in);


        Question[] questions = new Question [10];

        questions[0] = new Question("\n Who was the 44th president of the United States of America? \n",
                                      "1. Donald J. Trump ", "2. Barrak Hussein Obama II ", 
                                      "3. Joseph Robinette Biden Jr. ", "4. George Walker Bush ", 2);
        questions[1] = new Question("\n Before becoming dictator, Adolf Hitler's dream was to become a/an. ", 
                                      "1. Soldier ", "2. Artist ", "3. Businessman ", "4. Engineer \n", 2);
        questions[2] = new Question("\n Who was the first man in space? \n", 
                                      "1. Alan Shepard", "2. Neil Armstrong", 
                                      "3. Buzz Aldrin", "4. Yuri Gagarin", 4);
        questions[3] = new Question("\n Who discovered the laws of gravity?", 
                                      "1. Issac Newton", "2. Albert Einstein", 
                                      "3. Niels Bohr", "4. Galileo Galilei \n", 1);
        questions[4] = new Question("\n Which of the following wars had the most American casualties in United States' history? \n", 
                                      "1. World War 1", "2. World War 2",
                                      "3. The United States' Civil War", "4. The War of 1812 \n", 3);
        questions[5] = new Question("\n Which of the following empires ruled over modern-day Turkey before World War 1? \n", 
                                      "1. Byzantine Empire", "2. Roman Empire", 
                                      "3. Ottoman Empire", "4. Russian Empire \n", 3);
        questions[6] = new Question("\n According to U.S. News and World Report, which of the following nations is the most corrupt in 2021? \n", 
                                      "1. Kazakhstan", "2. Nigeria", 
                                      "3. Mexico", "4. Azerbaijan \n", 2);
        questions[7] = new Question("\n What was the first animal sent into space? \n", 
                                      "1. Fruit Fly", "2. Monkey", 
                                      "3. Dog", "4. Turtle \n", 1);
        questions[8] = new Question("\n What is the oldest movie industry in the world? \n", 
                                      "1. Bollywood", "2. Hollywood", 
                                      "3. Pakistani Films", "4. Turkish Films \n", 1);
        questions[9] = new Question("\n Which famous actress developed a device capable of jamming radio-controlled torpeodos? \n"
                                      , "1. Maryln Monroe", "2. Audrey Hepburn", "3. Elizabeth Taylor", "4. Hedy Lamarr \n", 4);
       
        int sum1 = 0;
        int sum2 = 0;
        int player1total = 0;
        int player2total = 0;
        int userinput;
        int userinput2;

        System.out.println("Player1 begin.");
        for ( int i=0; i< 5; i++)
        {
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getpossibleanswer1());
            System.out.println(questions[i].getpossibleanswer2());
            System.out.println(questions[i].getpossibleanswer3());
            System.out.println(questions[i].getpossibleanswer4());
            System.out.print("Please enter your answer: ");
            
            userinput = keyboard.nextInt();

            if(userinput == questions[i].getcorrectanswer())
            {
                System.out.println("Correct! \n");
                sum1++;
                player1total = sum1;
            }

        }
        System.out.println("It is now Player2's turn. \n");

        for (int i=5; i< 10 ; i++)
        {
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getpossibleanswer1());
            System.out.println(questions[i].getpossibleanswer2());
            System.out.println(questions[i].getpossibleanswer3());
            System.out.println(questions[i].getpossibleanswer4());
            System.out.print("Please enter your answer: ");
           
            userinput2 = keyboard.nextInt();
          

            
           
            if(userinput2 == questions[i].getcorrectanswer())
            {
                System.out.println("Correct! \n");
                sum2++;
                player2total = sum2;
                
            }
        }
        keyboard.close(); 

        if (player1total > player2total)
            System.out.println("Player 1 is the winner! \n");
           else if (player1total < player2total)
            System.out.println("Player 2 is the winner! \n");
           else if (player1total == player2total)
            System.out.println("It is a tie! \n");

        System.out.println("Scoreboard:\n");
        System.out.println("Player 1: "+ player1total + "\n");
        System.out.println("Player 2: "+ player2total + "\n");
    
     }
}
