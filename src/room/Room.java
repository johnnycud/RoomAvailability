package room;

public class Room {
	
	private boolean empty,clean;
	private int roomNo;
	private float rate;
	private char level[];
	private String type[];

	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	public void RoomType() {
		// TODO Auto-generated constructor stub
	}
	
	public void RoomRate() {
		// TODO Auto-generated constructor stub
	}
	
	public void Availibility() {
		// TODO Auto-generated constructor stub
	}
	
	public void RoomBooking() {
		// TODO Auto-generated constructor stub
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

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public char[] getLevel() {
		return level;
	}

	public void setLevel(char level[]) {
		this.level = level;
	}

	public String[] getType() {
		return type;
	}

	public void setType(String type[]) {
		this.type = type;
	}

}
