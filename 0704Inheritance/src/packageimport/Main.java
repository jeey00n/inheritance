package packageimport;

//Scanner클래스는 패키지 이름을 생략하고 사용할 수 있도록 해줍니다.
//import java.util.Scanner;

//java.util 패키지의 모든 클래스는 패키지 이름을 생략하고 사용할 수 있도록 해줍니다.
import java.util.*;
import java.sql.*;
//Date클래스는 java.util 패키지에도 있고 java.sql 패키지에도 있습니다.
//이렇게 여러 패키지에 존재하는 클래스의 경우는 반드시 구체적으로 import를 해야 합니다.
import java.util.Date;

public class Main {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		Date date = new Date();
		
		
		sc.close(); // import를 하지 않아도 sc를 불러내면 자동으로 import해준다.
	}

}
