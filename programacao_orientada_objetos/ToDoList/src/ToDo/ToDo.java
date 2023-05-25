package ToDo;

import java.util.Scanner;

public class ToDo {	
	String [] todo_list = new String[] {};
	String item;
	
	public ToDo(String item) {
		this.item = item;
	}
	
	String[] getList() {
		return this.todo_list;
	}
	
	void setList(String[] newList) {
		this.todo_list = newList;
	}
	
	void AddToList(String newItem) {

	}
	
	public static void main(String[] args) {
		
	}
}
