package CatchOrderException;

public class CatchOrderException {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int Value1 = Integer.parseInt(data1);
			int Value2 = Integer.parseInt(data2);
			int result = Value1 + Value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch (Exception e) {//ArrayIndexOutOfBoundsException의 상위 클래스인 Exception이 먼저 실행
			System.out.println("실행에 문제가 있습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {	// ArrayIndexOutOfBoundsException은 필요없는 Exception가 됨
													// 그래서 오류가 뜬다.
			System.out.println("실행 매개값의 수가 부족합니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
