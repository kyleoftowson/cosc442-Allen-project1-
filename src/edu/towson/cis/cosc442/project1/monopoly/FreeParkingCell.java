package edu.towson.cis.cosc442.project1.monopoly;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class FreeParkingCell.
 */
public class FreeParkingCell extends Cell {

	/**
	 * Instantiates a new free parking cell.
	 */
	public FreeParkingCell() {
		setName("Free Parking");
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction(java.lang.String)
	 */
	public boolean playAction(String msg) {
		if(msg!=null&&msg!=""){
    		JOptionPane.showMessageDialog(null, msg);
    	}
		return false;
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
}
