package test;

public class Student{
	private String name;
	private int kor, eng, math;
	int sum;
	float avg;
	
	public void setName(String name) {
		this.name = name;        //����, setter
	}
	public String getName() {
		return this.name;         //��ȯ
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	public void sum() {
		this.sum = this.kor+this.eng+this.math;
	}
	public void avg() {
		this.avg = this.sum/3;
	}
	public float showAge() {
		return this.avg;
	}
	
	
	void printStates() {
		System.out.println("���� : "+kor+", ����"+eng+"����"+math+"�հ�"+sum+"���"+avg);
		
	}
	
	
	
}