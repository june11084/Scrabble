import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissor {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your strikes");

        try{
            String playerOneStrike = bufferedReader.readLine();
            String playerTwoStrike = bufferedReader.readLine();
            if(playerOneStrike.equalsIgnoreCase("rock")&&playerTwoStrike.equalsIgnoreCase("rock")){
                System.out.println("draw");
            }else if(playerOneStrike.equalsIgnoreCase("rock")||playerOneStrike.equalsIgnoreCase("rock")){
                System.out.println("draw");
            }else if(){
                System.out.println("draw");
            }
            else if(){
                System.out.println("draw");
            }
            else{
                System.out.println("invalid input");
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
