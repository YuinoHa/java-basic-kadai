package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {


	public String getMyChoice() {
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = scanner.next();
			
			if ((input.equals("r") || input.equals("s") || input.equals("p"))) {
				
				scanner.close();
				return input;
				
			} else {
				System.out.println(input + "は入力が正しくありません。");
				continue;
			}
		}
	}
	
	public String getRandom() {
		
		String[] opponent = {"r", "s", "p"};
		
		String opponentChoice = opponent[(int)Math.floor(Math.random() * 3)];
		return opponentChoice;
	}
	
	public void playGame() {
		HashMap<String,String> choice = new HashMap<String,String>();
		
		choice.put("r", "グー");
		choice.put("s", "チョキ");
		choice.put("p","パー" );
		
		String mine = this.getMyChoice();
		String yours = this.getRandom();
		
		System.out.println("自分の手は" + choice.get(mine) + ",対戦相手の手は" + choice.get(yours));
		
		if ((mine.equals("r") && yours.equals("r")) || (mine.equals("s") && yours.equals("s")) || (mine.equals("p") && yours.equals("p"))) {
			System.out.println("あいこです");
		} else if ((mine.equals("r") && yours.equals("s")) || (mine.equals("s") && yours.equals("p")) || (mine.equals("p") && yours.equals("r"))) {
			System.out.println("あなたの勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}
	}
}
