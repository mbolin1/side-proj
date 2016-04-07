package stable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class STable{
	Scanner scan;
	ArrayList<Layer> table = new ArrayList<Layer>();
	
	class Layer{
		int level;
		ArrayList<String> items = new ArrayList<String>();
		Layer(int l){
			level = l;
		}
	};
	
	void readData(){
		String line;
		int scope = 0; //global
		while(scan.hasNext()){
			line =  scan.nextLine();
			analyzeLine(line);
		}
	}
	
	void analyzeLine(String line){
		
	}
	
	
	
	public static void main(String[] args){
		STable stable =  new STable();
		File fin = new File("input.txt");
		try {
			stable.scan =  new Scanner(fin);
			stable.readData();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found... exitting.");
			System.exit(0);
		}
	}
};