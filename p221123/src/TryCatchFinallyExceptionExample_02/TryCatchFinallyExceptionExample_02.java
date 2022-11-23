package TryCatchFinallyExceptionExample_02;

public class TryCatchFinallyExceptionExample_02 {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int Value1 = Integer.parseInt(data1);
			int Value2 = Integer.parseInt(data2);
			int result = Value1 + Value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {		//값이 입력되지 않았을때 오루
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
		} catch (NumberFormatException e) {	// 문자를 입력했을 경우 Exception (Int)
			System.out.println("숫자로 변환 할 수 없습니다.");

		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
