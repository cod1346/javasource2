package inheritance.code;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour>23)return;
		//0~23일때만 실행
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(hour < 0 || hour>59)return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(hour < 0 || hour>23)return;
		this.second = second;
	}
	
	
	
}
