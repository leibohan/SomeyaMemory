package storage.Class;

import java.util.ArrayList;

public class TableHeader {
	int tuplenum = 0;
	//final int[] possible_size = {8, 16, }; 
	ArrayList<String> head_names = new ArrayList<String>();
	ArrayList<Integer> head_lengths = new ArrayList<Integer>();
	int total_length = 0;
	public TableHeader() {
		
	}
	
	private void renewTTLLength() {
		int total_length = 0;
		for (int i: head_lengths) {
			total_length += i;
		}
		int cnt = 0;
		int t = total_length;
		while (t > 1) {
			t /= 2;
			cnt++;
		}
		t =  (int) Math.pow(2, cnt);
		if (total_length > t * 1.5) total_length = t*2;
		else if (total_length > t) total_length = (int) (t*1.5);
		else total_length = t;
		this.total_length =  total_length;
	}
	
	public void addHeader(String name, int length) {
		head_names.add(name);
		head_lengths.add(length);
		tuplenum ++;
		renewTTLLength();
	}
	
	public void removeHeader(String name) {
		int remove_index = head_names.indexOf(name);
		head_names.remove(remove_index);
		head_lengths.remove(remove_index);
		renewTTLLength();
	}
}
