package com.epam.designPatterns;

public class FacadeDP {
	
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public FacadeDP() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	public void run()
	{
		cpu.processData();
		memory.loadData();
		hardDrive.readData();
	}

	public static void main(String[] args) 
	{
		FacadeDP facadeDP = new FacadeDP();
		facadeDP.run();

	}

}

class CPU {
	public void processData(){}
}
class Memory {
	public void loadData(){}
}
class HardDrive{
	public void readData() {}
}

