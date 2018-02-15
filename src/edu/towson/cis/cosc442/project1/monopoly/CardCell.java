package edu.towson.cis.cosc442.project1.monopoly;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class CardCell.
 */
public class CardCell extends Cell {
    
    /** The type. */
    private int type;
    
    /** The available. */
    private boolean available = true;
	
	/**
	 * Instantiates a new card cell.
	 *
	 * @param type the type
	 * @param name the name
	 */
	public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    /* (non-Javadoc)
     * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction(java.lang.String)
     */
    public boolean playAction(String msg) {
    	
    	if(msg!=null&&msg!=""){
    		JOptionPane.showMessageDialog(null, msg);
    	}
    	return true;
    }
    
    /**
     * Gets the type.
     *
     * @return the type
     */
    public int getType() {
        return type;
    }

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#isAvailable()
	 */
	public boolean isAvailable() {
		return available;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#setAvailable(boolean)
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playerMoved(edu.towson.cis.cosc442.project1.monopoly.Player, int, edu.towson.cis.cosc442.project1.monopoly.GameMaster)
	 */
	public void playerMoved(Player player, int playerIndex, GameMaster gameMaster) {
		gameMaster.getGUI().setDrawCardEnabled(true);
	}
}
