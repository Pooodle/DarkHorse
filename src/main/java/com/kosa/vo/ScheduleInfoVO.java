package vo;

public class ScheduleInfoVO {
	private String hClass;
	private String distance;
	private String gName;
	private String gTime;
	private String gDate;
	private int gRound;
	private String place;
	
	public String gethClass() {
		return hClass;
	}
	public void sethClass(String hClass) {
		this.hClass = hClass;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgTime() {
		return gTime;
	}
	public void setgTime(String gTime) {
		this.gTime = gTime;
	}
	public String getgDate() {
		return gDate;
	}
	public void setgDate(String gDate) {
		this.gDate = gDate;
	}
	public int getgRound() {
		return gRound;
	}
	public void setgRound(int gRound) {
		this.gRound = gRound;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public String toString() {
		return "ScheduleInfoVO [hClass=" + hClass + ", distance=" + distance + ", gName=" + gName + ", gTime=" + gTime
				+ ", gDate=" + gDate + ", gRound=" + gRound + ", place=" + place + "]";
	}
}
