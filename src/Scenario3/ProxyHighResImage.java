package Scenario3;

public class ProxyHighResImage implements Image {
	private String fileName;
	private HighResImage highResImage;
	
	public ProxyHighResImage(String fileName) {
		this.fileName = fileName;
	}
	
	public void display(){
		if(highResImage == null)
			highResImage = new HighResImage(fileName);
		highResImage.display();
	}
}
