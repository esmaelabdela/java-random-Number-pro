package randomNumber;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomNum {

	public static void main(String[] args) {
		

		Set<Integer> myCol = new LinkedHashSet<Integer>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("give me the smallest number");
		int minNum = input.nextInt();
	
		Random random = new Random();
		int rndNum = random.nextInt(999);
		System.out.println(rndNum);
		
	
		 while(myCol.size() != 500) {
		 int number = random.nextInt(900) + 100;
		 myCol.add(number);
		 
			if (rndNum < minNum) {
				minNum = rndNum;
			}
		 System.out.println("min number is" + minNum);
		   
		 System.out.println(myCol);
		 System.out.println(myCol.size());
		
		}	
		
		
		
		
		
	}

}

