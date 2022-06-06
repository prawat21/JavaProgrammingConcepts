package JavaQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		try {
		      File fr = new File("C:/Users/Puneet.Rawat/OneDrive - UnitedLex/Desktop/CoforgeInterview.txt/");
		      Scanner myReader = new Scanner(fr);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
