package spring.di.entity;

public class AiswExam implements Exam {

   private int kor;
   private int eng;
   private int math;
   
   public AiswExam() {
      super();
   }
   public int getKor() {
      return kor;
   }
   public void setKor(int kor) {
      this.kor = kor;
   }
   public int getEng() {
      return eng;
   }
   public void setEng(int eng) {
      this.eng = eng;
   }
   public int getMath() {
      return math;
   }
   public void setMath(int math) {
      this.math = math;
   }
   
   @Override
   public int total() {
      int result = kor + eng + math;
      return result;
   }
   
   @Override
   public float avg() {
      float avg = (kor + eng + math)/3;
      return avg;
   }
}