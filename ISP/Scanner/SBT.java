/**
 * Michael Loughrin
 * Scan Bounds Transform
 * 
 * Reads 2 integers, 1 decimal
 * prints  integers from lower to upper
 * multiplied by the decimal
 */





import java.util.Scanner;

public class SBT {
    public static void main(String args[]) {
        
        /*
        Comments are parts of the code that are not really
        code, they are just there to make it more readible
        for other humans reading the code
        
        This is a long comment, it won't be read
        by the code. You can put anything here,
        it is strictly for documentation.
        
        CODE is so that computers can read it
        */
        
        
        // this is an example of a short commment
        int upper;
        int lower;
          
        Scanner kb = new Scanner(System.in);
        
        
        /*
        TODO: change this from println to print to see when
        to use print vs println
        
        
        println puts a new line, we don't want that here
        
        "Enter your upper value " is just text
        displayed to the screen. feel free
        to change it & mess around with it
        */
        System.out.println("Enter your upper value ");
        
        
        
        
        /*
        during assignment, right hand side is executed first
        
        
        kb.nextInt() grabs the integer from the user input (typing)
        then, upper is assigned to that value
        
        if we wanted to do this with a double,
        upper would need to be of type double
        and we would need to call kb.nextDouble() instead
        */
        upper = kb.nextInt();
        
        
        // prompt for the value
        // TODO: Add a space after "lower value" so when the user
        // inputs, it will be clean looking
        System.out.print("Enter the lower value");

        // same  here, we get the value then assign it
        lower = kb.nextInt();
        
        
        // start at the lower bound
        int i = lower;
        
        
        /*
        we want to go through
        all the values from
        lower to upper and apply some simple
        mathematical transformation to it
        
        we need a variable to keep track of
        where we are at, we will use "i"
        
        start i at lower
        
        at the end of the loop, i is incremented (i = i + 1) by 1
        so it can reach the next whole number
        
        after lots of increments, i will eventually be
        the same value as upper. the loop will run one more time.
        
        then, it will increment i again. after this,
        
        i will be greater than upper.
        
        Then, the loop breaks out, and all
        
        values we wanted are done
        */
        while(i <= upper)
        {
            /*
            some potentially complex
	    mathematical operation

	     PEMDAS is followed here
            */
            double result = (i*0.1) + 150;
            
            // two special characters inside strings:
            // \t essentially presses tab to the output
            // \n essentially presses enter to the output
            System.out.println(i + "\t" + result);
            
            i = i + 1;
        }
        
        /*
		Go through this loop by hand
		to get a better understanding of how loops work
		Make an example lower/upper (in your head or on paper)
		And go through to see how i moves
        */
    }
}