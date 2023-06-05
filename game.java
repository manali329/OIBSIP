import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randno = rand.nextInt(50)+1;
      
      // System.out.println("Random Number:"+randno);

         int MyCount=0;
         Scanner scanner = null;
         try {
            scanner = new Scanner(System.in);
        while(true){

                System.out.println("guess the number 1-50:");
                
                MyCount++;


                int playerguess=scanner.nextInt();
                
                if(playerguess == randno){
                
                    System.out.println("hurray! you Won the game pal");
                    System.out.println("Your total attempts area" + MyCount);
                    break;
                }
                else if(randno>playerguess){
                    System.out.println("Oops The Number is Higher,Guess Again");
                }
                else{
                    System.out.println("Oops The Number is lower,Guess Again");
              }
            }
    }finally{
        if (scanner !=null){
    scanner.close();
    }
}
    }
    
    
    
    

}