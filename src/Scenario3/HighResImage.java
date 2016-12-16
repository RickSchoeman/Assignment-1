package Scenario3;

public class HighResImage implements Image{
	private String fileName;
	
	public HighResImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
	}
	
	@Override
	public void display(){
		System.out.println("Displaying: " + fileName);
	}
	
	public void loadFromDisk(){
		System.out.println("Loading: " + fileName);
	}

}
