public class rps
{
    private String answer; 
    private int number; 

    public rps(String a) 
    {
        a = answer; 
        number = 1 + (int)(Math.random() * ((2) + 1)); 
    }
    
    //add a string called Computer 
    public String Computer() 
    {
        String comp; 

        if(number == 1) 
        {
            comp = "Rock"; 
        }
        else if(number == 2) 
        {
            comp = "Scissors"; 
        }
        else 
        {
            comp = "Paper"; 
        }
        return comp; 
    }
    //add three booleans 
    public boolean Win() 
    {
        boolean w = false; 
        if(answer.equals("Rock") && Computer().equals("Scissors"))
        {
            w = true; 
        }
        else if(answer.equals("Paper") && Computer().equals("Rock"))
        {
            w = true; 
        }
        else if(answer.equals("Scissors") && Computer().equals("Paper"))
        {
            w = true; 
        }
        else 
        {
            w = false; 
        }
        return w; 
    }
    //boolean for tie 
    public boolean Tie() 
    {
        boolean t = false; 

        if(answer.equals("Rock") && Computer().equals("Rock"))
        {
            t = true; 
        }
        else if(answer.equals("Paper") && Computer().equals("Paper"))
        {
            t = true; 
        }
        else if(answer.equals("Scissors") && Computer().equals("Scissors"))
        {
            t = true; 
        }
        else 
        {
            t = false; 
        }
        return t; 
    }
    //lose boolean 
    public boolean Lost() 
    {
        boolean l = false; 

        if(answer.equals("Rock") && Computer().equals("Paper"))
        {
            l = true; 
        }
        else if(answer.equals("Paper") && Computer().equals("Scissors"))
        {
            l = true; 
        }
        else if(answer.equals("Scissors") && Computer().equals("Rock"))
        {
            l = true; 
        }
        else 
        {
            l = false; 
        }
        return l; 
    }
    public void printAnswer() 
    {
        if(Win()) 
        {
            System.out.println("You picked " + answer); 
            System.out.println("The computer picked " + Computer()); 
            System.out.println("YOU WIN"); 
        }
        else if(Tie()) 
        {
            System.out.println("You picked " + answer); 
            System.out.println("The computer picked " + Computer()); 
            System.out.println("IT'S A TIE"); 
        }
        else 
        {
            System.out.println("You picked " + answer); 
            System.out.println("The computer picked " + Computer()); 
            System.out.println("YOU LOSE"); 
        }
    }

    

}

