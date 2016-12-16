package Scenario3;

public class ProxyHighResPicture implements Picture {
	private String fileName;
	private HighResPicture highResPicture;
	
	public ProxyHighResPicture(String fileName) {
		this.fileName = fileName;
	}
	
	public void display(){
		if(highResPicture == null)
			highResPicture = new HighResPicture(fileName);
		highResPicture.display();
	}
}
