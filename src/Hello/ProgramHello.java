package Hello;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Hello.Type.HelloWorld;

public class ProgramHello {

	   public static void main(String[] args) {
		   
		   // setting.xml 파일을 사용해서 ApplicationContext를 생성
		   ApplicationContext context = new ClassPathXmlApplicationContext("Hello/setting.xml");
		   
		   // ApplicationContext에서 HelloWorld Bean을 가져오기 위해 context.getBean(HelloWorld.class); 코드를 실행하여
		   // HelloWorld의 인터페이스를 구현한 클래스의 인스턴스를 가져온다.
		   HelloWorld HelloWorld = context.getBean(HelloWorld.class);
		   
		  // 가져온 인스턴스의 print() 메서드를 호출한다.
	      HelloWorld.print();
	      
	   }
	}