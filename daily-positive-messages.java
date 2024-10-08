
import java.util.Random;
public class Main {
	public static void myReminder (String dailyquote) {
	    System.out.println (dailyquote  + " Everything I want wants me more" );
}
  
// method that runs the app

     public static void main(String[ ] args){
         //quotes
String[ ] quotes  = {
   "I am creating the life of my dreams with boldness and confidence.",
   "I can do everything that I set my mind to.",
   "I am living a meaningful life.",
   "I am grounded and strong.",
   "I rest after working and let myself fully relax.",
   "I am understanding.",
   "I accept compliments with humility and gratitude.",
   "Taking care of yourself is productive.",
   "I am rooted, but I flow.",
   "I feel great about being my unique self."
   
    };
   // displays random quote whenever the user access the app 
   
Random quotePickup = new Random( );
int randomIndex =

quotePickup.nextInt(quotes.length);
String dailyQuote = quotes[randomIndex];
//displays picked up quote
myReminder (dailyQuote);
} 

}