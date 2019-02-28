package problem04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Gugudan {
	Gugudan(){
		System.out.println("구구단 게임 1~9 단 중 하나 입력해주세요!");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		String str;
		try {
			str = in.readLine();
			int gogoNum = new Integer(str).intValue();
			
			Random random = new Random();
			int rNum = (random.nextInt()%9)+1;
			
			int result = rNum * gogoNum;
			
			System.out.println(gogoNum+" *"+rNum+"=");
			str = in.readLine();
			gogoNum = new Integer(str).intValue();
			
			if(result == gogoNum) {
				System.out.println("맞았습니다.");
			}else {
				System.out.println("틀렸습니다.");
				
			}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
}
