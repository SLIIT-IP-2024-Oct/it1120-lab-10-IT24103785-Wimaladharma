import java.util.Scanner;

public class IT24103785Lab10Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Marks;
		char Grade;

        System.out.print("Enter the mark (0 - 100): ");
        Marks = input.nextInt();
        

        assert (Marks >= 0 || Marks <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");
		
		if (Marks < 40){
		Grade = 'F';
			
		}
		else if (Marks >= 40 && Marks < 50){
		Grade = 'D';
			
		}
		else if (Marks >= 50 && Marks < 60){
		Grade = 'C';	
			
		}
		else if (Marks >= 60 && Marks < 70){
		Grade = 'B';	
		
		}
		else{
		Grade = 'A';	
			
			
		}
		assert((Marks < 40 && Grade =='F') || (Marks >= 40 && Marks < 50 && Grade == 'D') || (Marks >= 50 && Marks < 60 && Grade =='C') || ((Marks >= 60 && Marks < 70 && Grade =='B') || Grade == 'A')):"Incorrect Grade Assigned";
		System.out.print("The Grade for the Entered mark is: "+Grade);
    }
}
