package stream.others;

import java.io.Console;

public class Consoletest {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		System.out.println("직업 : ");
		String job = console.readLine();
		System.out.println("비밀번호 : ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
		
		// console은 이클립에서 지원하지않음.
	}

}
