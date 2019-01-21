package storage.Class;

import java.nio.ByteBuffer;

public class MainStorage {
	//a single slice of memory at the size of 1KiB
	
	public boolean[] used_show = new boolean[1024];
	private boolean[] used = new boolean[1024];
	private ByteBuffer content = ByteBuffer.allocateDirect(1024);
	public boolean valid;
	
	public MainStorage() {
		for (int i = 0; i < 1024; i++) 
			used[i] = false;
		valid = true;
		updateUsed();
	}
	
	private void updateUsed() {
		for (int i = 0; i < 1024; i++)
			used_show[i] = used[i];
	}
	
	public void write(int start, ByteBuffer content) {
		int length = content.capacity();
		for (int i = 0; i < length; i++) {
			used[i] = true;
			this.content.put(i+start, content.get(i));
		}
		updateUsed();
		valid = true;
		return;
	}
	
	public void free(int start, int offset) {
		for (int i = start; i < start + offset; i++) 
			used[i] = false;
		updateUsed();
		valid = true;
		return;
	}
	
	public ByteBuffer read(int start, int offset) {
		ByteBuffer result = ByteBuffer.allocateDirect(offset);
		for (int i = 0; i < offset; i++) {
			if (used[i + start]) result.put(i, content.get(i+start));
			else {
				valid = false;
				return null;
			}
		}
		return content;
	}
}
