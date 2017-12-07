package booking;

import java.sql.Date;

import room.Room;

public class Hotel {

	private float phoneNo;
	private String address;
	private float cost;
	private Date date;
	private Room num;
	private boolean clean = false;
	private boolean empty = false;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	
	public void Reception() {
		// TODO Auto-generated constructor stub
	}
	
	public void Housekeeping() {
		// TODO Auto-generated constructor stub
	}
	
	public void RoomAvailibility() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public float getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(float phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Room getNum() {
		return num;
	}

	public void setNum(Room num) {
		this.num = num;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

}
