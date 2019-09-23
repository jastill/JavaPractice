/**
 * 
 */

package com.tj34.hockey;

import java.io.Serializable;

/**
 * @author taylo
 *
 */

import java.util.Date;

public class Invoice implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5170495330868410458L;

	public enum Status {
		NOT_SUBMITTED,
		SUBMITTED,
		PAID
	};
	
	public enum GameType {
		GREYBEARD,
		YOUTH,
		UNKNOWN
	};
	
	private Date gameDate;
	private GameType gameType;
	private Status invoiceStatus;
	private double gameFee;
	
	/**
	 * 
	 */
	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Invoice(Date date, GameType type, Status status, double d) {
		this.gameDate = date;
		this.gameType = type;
		this.invoiceStatus = status;
		this.gameFee = d;
	}


	
	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public GameType getGameType() {
		return gameType;
	}

	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}

	public Status getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(Status invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public double getGameFee() {
		return gameFee;
	}

	public void setGameFee(double gameFee) {
		this.gameFee = gameFee;
	}


    @Override
    public String toString() {
        return "{'date':'"+gameDate+"'.'gameType':'"+gameType+"',invoiceStatus':'"+invoiceStatus+"','gameFee':'"+gameFee+"'}";
    }

}
