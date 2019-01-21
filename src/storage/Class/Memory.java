package storage.Class;

public class Memory {
	MainStorage[] content = new MainStorage[8192];
	boolean [][] used_map = new boolean [8192][1024];

	private int block_ptr = 0;
	private int offset_ptr = 0;
	
	public Memory() {
		for (int i = 0; i < 8192; i++) 
			for (int j = 0; j < 1024; j++) 
				used_map[i][j] = false;
	}

	public ByteBuffer read(int start, int offset) {
	    return null;
    }

    public boolean write(ByteBuffer content, int classNum, int tuple_length) {
	    return true;
    }

    public boolean delete(int start, int offset) {

    }

    public ByteBuffer read(int classNum, int tuple_length, int offset_in_tuple, ByteBuffer content){

    }

    public ByteBuffer delete(int classNum, int tuple_length, int offset_in_tuple, ByteBuffer content){

    }


    private void find_place(int start, int end, int length) {
        for (int i = start; i < end; i+=length) {
            if (used_map[(int)(i/1024)][i % 1024] == false) {
                block_ptr = (int)(i/1024);
                offset_ptr = i % 1024;
                return;
            }
        }
        block_ptr = -1;
        offset_ptr = -1;
        return;
    }
	/*
	public void main(String[] args) {
		boolean [] a = used_map[3000];
		System.out.print(a[0]);
	}
	*/
}
