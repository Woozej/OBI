package OBI;

public class Card implements ICard {
	private int cardID;
	private int cardColor;
	Card(int id, int color){
		this.cardID = id;
		this.cardColor = color;	
	}
	public void ShowCard() {
		String color;
		if (this.cardColor == 1)
			color = "pik";
		else if (this.cardColor == 2)
			color = "kier";
		else if (this.cardColor == 3)
			color = "trefl";
		else if (this.cardColor == 4)
			color = "karo";
		else
			color = "b³¹d";
		if (this.cardID == 1)
			System.out.println("As " + color);
		else if (this.cardID == 11)
			System.out.println("Walet " + color);
		else if (this.cardID == 12)
			System.out.println("Dama " + color);
		else if (this.cardID == 13)
			System.out.println("Król " + color);
		else
			System.out.println(this.cardID + " " + color);
			
	}
}
