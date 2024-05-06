package kadai_011;

public class Prime_chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] primeJudge = new boolean[101];
		
		for(int i=1; i < primeJudge.length; i++) {
			primeJudge[i] = true;
		}
		
		int devicedNum = 2;
		
		while(devicedNum < primeJudge.length) {
			
			for(int j = devicedNum + 1; j < primeJudge.length; j++) {
				
				if(j % devicedNum == 0) {
					primeJudge[j] = false;
					continue;
				}
			}
			
			devicedNum += 1;
			
		}
		
		for(int k = 2; k < primeJudge.length; k++) {
			if(primeJudge[k]) {
				System.out.println(k);
			}
		}
		
	}

}
