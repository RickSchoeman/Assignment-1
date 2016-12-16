package Scenario3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Image> proxyImages = new ArrayList<Image>();
		proxyImages.add(new ProxyHighResImage("proxyimage1.png"));
		proxyImages.add(new ProxyHighResImage("proxyimage2.png"));
		proxyImages.add(new ProxyHighResImage("proxyimage3.png"));
		proxyImages.add(new ProxyHighResImage("proxyimage4.png"));
		List<Image> hRImages = new ArrayList<Image>();
		hRImages.add(new HighResImage("image1.png"));
		hRImages.add(new HighResImage("image2.png"));
		hRImages.add(new HighResImage("image3.png"));
		hRImages.add(new HighResImage("image4.png"));
		System.out.println("\nProxy images:");
		for(Image i : proxyImages){
			i.display();
		}
		System.out.println("\nHigh Resolution images:");
		for(Image i : hRImages){
			i.display();
		}
		System.out.println("");
		proxyImages.get(0).display();
		proxyImages.get(1).display();
		proxyImages.get(2).display();
		proxyImages.get(3).display();
	}
}
