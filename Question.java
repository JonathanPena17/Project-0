//Jonathan Pena
//CS1400
//Assignment4
//November 5, 2021


public class Question 
{
    private String questions;
    private String possibleanswer1;
    private String possibleanswer2;
    private String possibleanswer3;
    private String possibleanswer4;
    private int correctanswer;

    public Question(String questions , String possibleanswer1, String possibleanswer2, String possibleanswer3, String possibleanswer4 , int correctanswer )
    {
       this.questions = questions;
       this.possibleanswer1 = possibleanswer1;
       this.possibleanswer2 = possibleanswer2;
       this.possibleanswer3 = possibleanswer3;
       this.possibleanswer4 = possibleanswer4;
       this.correctanswer = correctanswer;
    }

    public void setQuestion(String questions )
    {
       this.questions = questions;
    }

    public String getQuestion()
    {
        return questions; 
    }

    public void setpossibleanswer1 (String possibleanswer1)
    {
        this.possibleanswer1 = possibleanswer1;
    }

    public String getpossibleanswer1()
    {
        return possibleanswer1;
    }

    public void setpossibleanswer2(String possibleanswer2)
    {
        this.possibleanswer2 = possibleanswer2;
    }

    public String getpossibleanswer2()
    {
        return possibleanswer2;
    }

    public void setpossibleanswer3 (String possibleanswer3)
    {
        this.possibleanswer3 = possibleanswer3;
    }

    public String getpossibleanswer3()
    {
        return possibleanswer3;
    }
    
    public void setpossibleanswer4 (String possibleanswer4)
    {
        this.possibleanswer4 = possibleanswer4;
    }

    public String getpossibleanswer4()
    {
        return possibleanswer4;
    }

    public void setcorrectanswer (int correctanswer)
    {
        this.correctanswer = correctanswer;
    }

    public int getcorrectanswer()
    {
        return correctanswer;
    }

}
