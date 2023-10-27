package com.domain.numbergame;

import java.util.Scanner;

class rangen{
    public int generate(int max, int min){
        return (int) (Math.random()*(max-min+1)+min) ;
    }

}
public class Numbergame{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner (System.in);
        rangen rg=new rangen();
        int totalAttempts=0;
        int win=0;

         while(true){
            String x;
			System.out.println(x="Enter the Maximum Number");
            int max=sc.nextInt();
            System.out.println(x="Enter the Minimum Number");
            int min=sc.nextInt();
            sc.nextLine();


            int cnum=rg.generate(max,min);
             int attempt=0;

             while(true){
                System.out.println("guess a number between "+ max+" and "+min);
                int gnum= sc.nextInt();
                attempt++;

                if(gnum>cnum){
                    System.out.println(x="Its Greater");
             }
             else if(gnum<cnum){
                    System.out.println(x="Its Lower");
             }
             else{
                System.out.println(x="Correct Guess");
                win++;
                break;
             }
          }
          totalAttempts +=attempt;
          System.out.println("Attempts ="+ attempt);
          System.out.println("Wins ="+ win);

          double winrate=(double) win/ totalAttempts*100;
         String format;
		System.out.printf(format="Your Winrate is %.2f%%\n",winrate);
          System.out.println(x="Do you Want to play again (yes/no)");
          String playAgain=sc.next();
          String anotherString;
		if(!playAgain.equalsIgnoreCase(anotherString="yes")){
            sc.close();
            int status;
			System.exit(status=0);
          }
          sc.nextLine();
        }
    }
    public int generate(int max, int min) {
    	// TODO Auto-generated method stub
    	return 0;
}
   
}




