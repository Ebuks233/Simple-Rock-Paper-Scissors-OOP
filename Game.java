public class Game {
    String user_option;
    String Computer_option;

    void result(){
        if(user_option.equalsIgnoreCase("Rock") && Computer_option.equalsIgnoreCase("Paper")){
            System.out.println("Computer wins You lose");
        }
        else if(user_option.equalsIgnoreCase("Paper") && Computer_option.equalsIgnoreCase("Rock")){
            System.out.println("You win Computer loses");
        }
        else if(user_option.equalsIgnoreCase("Scissors") && Computer_option.equalsIgnoreCase("Paper")){
            System.out.println("you win computer lose");
        }
        else if(user_option.equalsIgnoreCase("Paper") && Computer_option.equalsIgnoreCase("Scissors")){
            System.out.println("You lose Computer wins");
        }
        else if(user_option.equalsIgnoreCase("Scissors") && Computer_option.equalsIgnoreCase("Rock")){
            System.out.println("You lose Computer wins");
        }
        else if(user_option.equalsIgnoreCase("Rock") && Computer_option.equalsIgnoreCase("Scissors")){
            System.out.println("You win Computer loses");
        }
        else if(!user_option.equalsIgnoreCase("Rock")  || !user_option.equalsIgnoreCase("Paper") || !user_option.equalsIgnoreCase("Scissors")){
            System.out.println("Wrong option try again");

        }
        
    }

}
