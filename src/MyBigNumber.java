import java.util.ArrayList;

public class MyBigNumber {

	
	public static String sum(String stn1, String stn2) {
		if(stn1.length() < stn2.length()) {
			String tmp = stn1;
			stn1 = stn2;
			stn2 = tmp;
		}
		String[] l1 = stn1.split("");
		String[] l2 = stn2.split("");
		String result = "";
		int n_stn1 = l1.length - 1;
		int n_stn2 = l2.length - 1;
		int remem = 0;
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		while(n_stn1>=0) {
			
			num1 = Integer.parseInt(l1[n_stn1]);
			num2 = n_stn2 < 0 ? 0 : Integer.parseInt(l2[n_stn2]);
			
			sum = num1 + num2 + remem;
			if(sum > 9) {
				result = (sum%10)+result;
				remem = 1;
			}else if(sum < 10) {
				result = sum + result;
				remem = 0;
			}
			n_stn1--;
			n_stn2--;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum("451","1648"));
	}

}
