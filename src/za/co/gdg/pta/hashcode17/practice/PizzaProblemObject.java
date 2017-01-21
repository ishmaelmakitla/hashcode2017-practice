package za.co.gdg.pta.hashcode17.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PizzaProblemObject {
	
	int rowsCount;
	int columnCount;
	int minIngredientPerSlice;
	int maxCellsPerSlices;
	
	HashMap<Integer, String> pizzaMap;
	
	
	public PizzaProblemObject(int rowsCount, int columnCount, int minIngredientPerSlice, int maxCellsPerSlices) {
		super();
		this.rowsCount = rowsCount;
		this.columnCount = columnCount;
		this.minIngredientPerSlice = minIngredientPerSlice;
		this.maxCellsPerSlices = maxCellsPerSlices;
		pizzaMap = new HashMap<Integer, String>();
	}
	
	public PizzaProblemObject() {
		
	}
	
	
	
	public HashMap<Integer, String> getPizzaMap() {
		return pizzaMap;
	}

	public void setPizzaMap(HashMap<Integer, String> pizzaMap) {
		this.pizzaMap = pizzaMap;
	}
	
	public void addSlice(int rowIndex, String slice){
		pizzaMap.put(rowIndex, slice);		
	}
	
	public String getSlice(int index){
		return pizzaMap.get(index);
	}

	public int getRowsCount() {
		return rowsCount;
	}
	public void setRowsCount(int rowsCount) {
		this.rowsCount = rowsCount;
	}
	public int getColumnCount() {
		return columnCount;
	}
	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}
	public int getMinIngredientPerSlice() {
		return minIngredientPerSlice;
	}
	public void setMinIngredientPerSlice(int minIngredientPerSlice) {
		this.minIngredientPerSlice = minIngredientPerSlice;
	}
	public int getMaxCellsPerSlices() {
		return maxCellsPerSlices;
	}
	public void setMaxCellsPerSlices(int maxCellsPerSlices) {
		this.maxCellsPerSlices = maxCellsPerSlices;
	}
	
	public static PizzaProblemObject fromInputFile(String filename){
		//create using the parser
		return null;
	}
	/*
	 * Utility function that executes the solution to the problem.
	 * This does the algorithmic stuff.
	 */
	public void solve(){
		
	}
	
	/*
	 * 
	 * Utility function to 'draw' the pizza
	 */
	public void print(){
	  System.out.println("Printing Pizza...");
	  for(int key : pizzaMap.keySet()){
		  System.out.println(key+": "+pizzaMap.get(key));
		  
	  }
	}
	
	public void as2D () {
		
		int columns = pizzaMap.get(0).length();
		int rows = pizzaMap.size();
		
		char[][] pizzaMatrix = new char[rows][columns];
		for(int x=0; x< rows; x++){
			String pizzaSlice = pizzaMap.get(x);
			String[] pizzaSliceChars = pizzaSlice.split("");
			for (int y=0; y <columns; y++){
				pizzaMatrix[x][y] = pizzaSliceChars[y].toCharArray()[0];
			}
		}
		
		String outputMatrix = "";
		StringBuilder stringBuilder = new StringBuilder();
		for(int x=0; x< rows; x++){
			for (int y=0; y <columns; y++){
				stringBuilder.append(pizzaMatrix[x][y]);
				//end of row?
				if(y+1 >= columns){
					stringBuilder.append('\n');
				}
			}
		}
		outputMatrix = stringBuilder.toString();
		System.out.println("==================================================");
		System.out.println(outputMatrix);		
		
	}
	

}
