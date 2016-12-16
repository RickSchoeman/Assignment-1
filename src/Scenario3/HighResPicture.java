package Scenario3;

public class HighResPicture implements Picture {
	private String fileName;
	
	public HighResPicture(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
	}
	
	@Override
	public void display(){
		System.out.println("Weergeven: " + fileName);
	}
	
	public void loadFromDisk(){
		System.out.println("Laden: " + fileName);
	}

}
