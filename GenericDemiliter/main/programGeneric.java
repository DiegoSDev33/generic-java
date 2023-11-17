package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductGeneric;
import services.CalculationService;

public class programGeneric  {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<ProductGeneric> list = new ArrayList<>();
		
		String path = "c:\\temp\\number.txt";
		
		try(BufferedReader br = new BufferedReader( new FileReader(path))){
			
			String line = br.readLine();
			String[]fields = line.split(",");
			while(line != null) {
			list.add(new ProductGeneric(fields[0], Double.parseDouble(fields[1])));
			line = br.readLine();
			
			
		}
		ProductGeneric x = CalculationService.max(list);
		System.out.println("Max");
		System.out.println(x);
	
				
		
	}catch(IOException e ) {
		System.out.println("Error" + e.getMessage());
	}
	}

	
}
