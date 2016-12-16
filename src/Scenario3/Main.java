package Scenario3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Picture> proxyPictures = new ArrayList<Picture>();
		proxyPictures.add(new ProxyHighResPicture("proxyPicture1.png"));
		proxyPictures.add(new ProxyHighResPicture("proxyPicture2.png"));
		proxyPictures.add(new ProxyHighResPicture("proxyPicture3.png"));
		proxyPictures.add(new ProxyHighResPicture("proxyPicture4.png"));
		List<Picture> hRPictures = new ArrayList<Picture>();
		hRPictures.add(new HighResPicture("Picture1.png"));
		hRPictures.add(new HighResPicture("Picture2.png"));
		hRPictures.add(new HighResPicture("Picture3.png"));
		hRPictures.add(new HighResPicture("Picture4.png"));
		System.out.println("\nProxy Pictures:");
		for(Picture i : proxyPictures){
			i.display();
		}
		System.out.println("\nHigh Resolution Pictures:");
		for(Picture i : hRPictures){
			i.display();
		}
		System.out.println("");
		proxyPictures.get(0).display();
		proxyPictures.get(1).display();
		proxyPictures.get(2).display();
		proxyPictures.get(3).display();
	}
}
