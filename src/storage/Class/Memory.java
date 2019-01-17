package storage.Class;

public class Memory {
	MainStorage[] content = new MainStorage[8192];
	boolean [][] used_map = new boolean [8192][1024];
	
	public Memory() {
		for (int i = 0; i < 8192; i++) 
			for (int j = 0; j < 1024; j++) 
				used_map[i][j] = false;
	}
	
	/*
	public void main(String[] args) {
		boolean [] a = used_map[3000];
		System.out.print(a[0]);
	}
	*/
}
