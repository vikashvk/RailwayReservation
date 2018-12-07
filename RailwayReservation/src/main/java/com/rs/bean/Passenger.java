package com.rs.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author v2
 *
 */
@Document(collection = "Reservation")
//bean class with all attributes and getter setter to give values
public class Passenger {
	
	/**
	 * pnrno is for pnr Number for enquiry
	 * passenger_name is name of passenger travelling
	 * source_loc is place from where he is boarding
	 * desc_loc is destination place
	 * price is fare of travelling
	 */
	@Id
	private String pnrno;
	private String passenger_name;
	private String source_loc;
	private String desc_loc;
	private int price;

	/**
	 * Constructor of this class
	 */
	public Passenger() {
		super();
	}

	/**
	 * @return pnrno 
	 */
	public String getPnrno() {
		return pnrno;
	}

	/**
	 * @param pnrno is  pnr Number for enquiry
	 */
	public void setPnrno(String pnrno) {
		this.pnrno = pnrno;
	}

	public String getPassenger_name() {
		return passenger_name;
	}

	/**
	 * @param passenger_name of person who is boarding
	 */
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}

	/**
	 * @return source location
	 */
	public String getSource_loc() {
		return source_loc;
	}

	/**
	 * @param source_loc
	 */
	public void setSource_loc(String source_loc) {
		this.source_loc = source_loc;
	}

	/**
	 * @return
	 */
	public String getDesc_loc() {
		return desc_loc;
	}

	/**
	 * @param desc_loc
	 */
	public void setDesc_loc(String desc_loc) {
		this.desc_loc = desc_loc;
	}

	/**
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passenger [pnrno=" + pnrno + ", passenger_name=" + passenger_name + ", source_loc=" + source_loc
				+ ", desc_loc=" + desc_loc + ", price=" + price + "]";
	}

}
