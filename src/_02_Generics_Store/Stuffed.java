package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Stuffed extends NonFood{
	public Stuffed() {
		if(new Random().nextBoolean()) {
			this.item = "stuffed1.jpeg";
		}
		else {
			this.item = "stuffed2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
