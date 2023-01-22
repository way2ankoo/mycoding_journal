
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1; i<200; i++) {
			int digits = getDigits(i);
			if(ifArm(i,digits))
				System.out.println(i);
		}
	}
	
	public static int getDigits(int num) {
		int digit = 0;
		while(num>0) {
			num = num/10;
			digit++;
		}
		return digit;
	}
	
	public static boolean ifArm(int num, int digits){
		int orig = num;
		int tempSum = 0;
		while(num>0) {
			int lastDig = num%10;
			tempSum = (int) (tempSum + Math.pow(lastDig, digits));
			num = num/10;
		}
		if(orig == tempSum)
			return true;
		else
			return false;
		
	}

}
