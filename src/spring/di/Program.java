package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.AiswExam;
import spring.di.entity.Exam;
import spring.di.ui.DisplayExam;
import spring.di.ui.GridDisplayExam;
import spring.di.ui.InlineDisplayExam;

import spring.di.ui.DisplayExam;

public class Program {

   public static void main(String[] args) {
	   
	   ApplicationContext context = new ClassPathXmlApplicationContext("/spring/di/setting.xml");
	   DisplayExam displayExam = context.getBean(DisplayExam.class);

      displayExam.display();
      
   }
}
