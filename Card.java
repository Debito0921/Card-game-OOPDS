class Card{
	private String cardSuit;
	private String cardRank;

	public Card(){};
	public Card(String cardSuit, String cardRank)
	{
		this.cardSuit = cardSuit;
		this.cardRank = cardRank;
	}
	public String getCardSuit(){
		return cardSuit;
	}
	public String getCardRank(){
		return cardRank;
	}

	public void setCardSuit(String cardSuit){
		this.cardSuit = cardSuit;
	}
	public void setCardRank(String cardRank){
		this.cardRank = cardRank;
	}

	public int cardValue(String cardRank) {
		switch (cardRank){
			case "A" : return 1; 
			case "2" : return 2; 
			case "3" : return 3; 
			case "4" : return 4;	
			case "5" : return 5;
			case "6" : return 6;
			case "7" : return 7;
			case "8" : return 8;
			case "9" : return 9;
			case "X" : return 10;
			case "J" : return 10;
			case "Q" : return 10;
			case "K" : return 10;
			default  : return Integer.parseInt(cardRank);
		}
	}
} 	