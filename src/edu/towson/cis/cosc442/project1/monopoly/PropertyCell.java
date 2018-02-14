package edu.towson.cis.cosc442.project1.monopoly;

public class PropertyCell extends Cell {
	private String colorGroup;
	private int housePrice;
	private int numHouses;
	private int rent;
	private int sellPrice;
	public String getColorGroup() {
		return colorGroup;
	}

	public int getHousePrice() {
		return housePrice;
	}

	public int getNumHouses() {
		return numHouses;
	}
    
    public int getPrice() {
		return sellPrice;
	}

	public int getRent() {
		int rentToCharge = calculateMonopoliesRent();
		if(numHouses > 0) {
			rentToCharge = rent * (numHouses + 1);s
		}
		return rentToCharge;
	}

	/**
	 * @return
	 */
	private int calculateMonopoliesRent() {
		int rentToCharge = rent;
		String [] monopolies = theOwner.getMonopolies();
		for(int i = 0; i < monopolies.length; i++) {
			if(monopolies[i].equals(colorGroup)) {
				rentToCharge = rent * 2;
			}
		}
		return rentToCharge;
	}

	public void playAction() {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(theOwner != currentPlayer) {
				currentPlayer.payRentTo(theOwner, getRent());
			}
		}
	}

	public void setColorGroup(String colorGroup) {
		this.colorGroup = colorGroup;
	}

	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	public void setNumHouses(int numHouses) {
		this.numHouses = numHouses;
	}

	public void setPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
