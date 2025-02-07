package Variable;

public class Alone01 {

	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분 ");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + " 분");
	}

}
