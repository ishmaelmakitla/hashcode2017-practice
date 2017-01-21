package za.co.gdg.pta.hashcode17.practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class PizzaInputFileParser {
	
	public static final String SPACE = " ";
	
	public static PizzaProblemObject parse(String inputFilename){
		//problem object
		PizzaProblemObject problemObject = null; 
		try{
			FileReader fileReaderr = new FileReader(inputFilename);
			BufferedReader bufferedReader = new BufferedReader(fileReaderr); 
			//line in the file
			String inputLine;
			//tracker for lines as we read them from file
		    int lineCounter = 0;
		    
		    		    		    
		    while ((inputLine = bufferedReader.readLine()) != null){
		    	
		    	if(lineCounter == 0){
		    		//this is the first line which describes how the rest of the file should be read;
		    		String[] descriptors = inputLine.split(SPACE);
		    		//get number of rows
		    		int R =Integer.parseInt(descriptors[0]);;
		    		//get number of columns
		    		int C =Integer.parseInt(descriptors[1]);;
		    		//get min number of each ingredient per slice
		    		int L = Integer.parseInt(descriptors[2]);;
		    		//get max total number of cells of a slice
		    		int H = Integer.parseInt(descriptors[3]);
		    		
		    		problemObject = new PizzaProblemObject(R, C, L, H);
		    	}
		    	else{
		    		//pizza
		    		problemObject.addSlice((lineCounter-1), inputLine);
		    	}
		    	
		    	lineCounter +=1;
		    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return problemObject;
	}

}
