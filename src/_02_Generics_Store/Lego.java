package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Lego extends NonFood{
	public Lego() {
		if(new Random().nextBoolean()) {
			this.item = "lego1.jpeg";
		}
		else {
			this.item = "lego2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
