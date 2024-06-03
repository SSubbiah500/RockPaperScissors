import java.util.Scanner; 
public class run{
    public static void main(String[] args)
    {
        //add some code here 
        Scanner input = new Scanner(System.in); 

        System.out.println("Let's play rock paper scissors"); 
        System.out.println("Enter your answer right here"); 
        String ans = input.nextLine(); 
        //call class 
        rps game = new rps(ans); 

        game.Win(); 
        game.Lost(); 
        game.Tie(); 
        game.printAnswer(); 
    }
}