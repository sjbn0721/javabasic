package race;

import javax.sound.midi.Soundbank;

public class Player {
	private String name;
	private int record;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public int getRecord() {
		return this.record;
	}
	public void printStates(){
		System.out.println(getName()+" ���� ����� "+getRecord()+"�� �Դϴ�.");
	}	
}
