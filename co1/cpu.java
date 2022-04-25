package mca226;
import java.util.*;
public class cpu{
	int price;
	class processor{
		int no_of_core;
		String manufacturer;
		processor(int no_of_core,String manufacturer)
		{
			this.no_of_core=no_of_core;
			this.manufacturer=manufacturer;
			System.out.println("NO OF CORES: " + this.no_of_core);
			System.out.println("MANUFACTURER: " + this.manufacturer);
			
			
		}
	}
	static class ram{
		String memory;
		String manufacturer;
		public ram(String memory,String manufacturer)
		{
			this.memory=memory;
			this.manufacturer=manufacturer;
			System.out.println("MEMORY: " + this.memory);
			System.out.println("MANUFACTURER: " + this.manufacturer);
			
		}
	}
	public static void main(String [] args) {
		
		cpu object = new cpu();
		
		cpu.processor obj1 = object.new processor(2,"intel");
		
		cpu.ram obj2 = new cpu.ram("ddr3","crucial");
	}

}

	

