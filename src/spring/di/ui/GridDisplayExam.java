package spring.di.ui;

import spring.di.entity.Exam;

public class GridDisplayExam implements DisplayExam {
	
	private Exam exam;
	
	@Override
    public void display() {
	   System.out.println("-----------------------------------------------");
       System.out.printf("total : %d", exam.total());
       System.out.printf("Acerage : %f ~~~~~\\n", exam.avg());
       System.out.println("-----------------------------------------------");
    }
    
    public void setExam(Exam exam)
    {
       this.exam = exam;
    
    }

}
