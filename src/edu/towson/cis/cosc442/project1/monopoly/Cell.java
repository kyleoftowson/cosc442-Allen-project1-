package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class Cell.
 */
public abstract class Cell implements IOwnable {
	
	/** The name. */
	private String name;
	
	/** The owner. */
	protected Player theOwner;
	
	/** The available. */
	boolean available = true;

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getTheOwner()
	 */
	@Override
	public Player getTheOwner() {
		return theOwner;
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getPrice()
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/**
	 * Play action.
	 *
	 * @param msg the msg
	 * @return true, if successful
	 */
	public abstract boolean playAction(String msg);

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#setTheOwner(edu.towson.cis.cosc442.project1.monopoly.Player)
	 */
	@Override
	public void setTheOwner(Player theOwner) {
		this.theOwner = theOwner;
	}
    
    /* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#toString()
	 */
    @Override
	public String toString() {
        return name;
    }

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#playerMoved(edu.towson.cis.cosc442.project1.monopoly.Player, int, edu.towson.cis.cosc442.project1.monopoly.GameMaster)
	 */
	public void playerMoved(Player player, int playerIndex, GameMaster gameMaster) {
		if (this.isAvailable()) {
			int price = this.getPrice();
			if (price <= player.getMoney() && price > 0) {
				gameMaster.getGUI().enablePurchaseBtn(playerIndex);
			}
		}
		gameMaster.getGUI().enableEndTurnBtn(playerIndex);
	}
}
