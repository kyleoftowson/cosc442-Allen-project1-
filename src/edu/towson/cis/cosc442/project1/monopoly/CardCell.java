package edu.towson.cis.cosc442.project1.monopoly;

public class CardCell extends Cell {
    private int type;
    private boolean available = true;
	public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public boolean playAction(String msg) {
    	
    	return true;
    }
    
    public int getType() {
        return type;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void playerMoved(Player player, int playerIndex, GameMaster gameMaster) {
		gameMaster.getGUI().setDrawCardEnabled(true);
	}
}
