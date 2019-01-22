package storage.Class;

public class Memory {
	private MainStorage[] content = new MainStorage[8192];
	private boolean [][] used_map = new boolean [8192][1024];

	private int block_ptr = 0;
	private int offset_ptr = 0;

	final private int class_limit = 128; // tuples in a single class can take up no more storage than 128KiB
    /*

    please give each class a sequence number and save them into a table.
    when you intend to search for a class, give me the class sequence number and the tuple length of the class.
    class number shold begin from 0, and the maximum should be 8192/class_limit - 1.

    please ensure tuple_length of a class a static divider of 1024Byte.

     */
	
	public Memory() {
		for (int i = 0; i < 8192; i++) 
			for (int j = 0; j < 1024; j++) 
				used_map[i][j] = false;
	}

	public ByteBuffer read(int start, int offset) {
	    ByteBuffer result = ByteBuffer.allocateDirect(offset);
	    ByteBuffer tmp = ByteBuffer.allcateDirect(1024);
        block_ptr = (int)(start/1024);
        offset_ptr = start % 1024;
        int partial_length = 1024-offset_ptr, ptr_tmp = 0;
        tmp = content[block_ptr++].read(offset_ptr, partial_length);
        for (int j = 0; j < partial_length; i++)
            result.put(ptr_tmp++, tmp.get(j));
        partial_length = 1024
        for (int i = 2048 - offset_ptr; i < offset; i += 1024) {
            tmp = content[block_ptr++].read(0, 1024);
            for (int j = 0; j < partial_length; i++)
                result.put(ptr_tmp ++, tmp.get(j));
        }
        tmp = content[block_ptr].read(0, (offset + start - 1) % 1024 + 1);
        for (int j = 0; j < partial_length; i++)
            result.put(ptr_tmp ++, tmp.get(j));
	    return null;
    }

    public boolean write(ByteBuffer content, int classNum, int tuple_length) {
        ByteBuffer tmp = ByteBuffer.allcateDirect(1024);
        block_ptr = (int)(start/1024);
        offset_ptr = start % 1024;
        int partial_length = 1024-offset_ptr, ptr_tmp = 0;
        tmp = content[block_ptr++].read(offset_ptr, partial_length);
        for (int j = 0; j < partial_length; i++)
            result.put(ptr_tmp++, tmp.get(j));
        partial_length = 1024
        for (int i = 2048 - offset_ptr; i < offset; i += 1024) {
            tmp = content[block_ptr++].read(0, 1024);
            for (int j = 0; j < partial_length; i++)
                result.put(ptr_tmp ++, tmp.get(j));
        }
        tmp = content[block_ptr].read(0, (offset + start - 1) % 1024 + 1);
        for (int j = 0; j < partial_length; i++)
            result.put(ptr_tmp ++, tmp.get(j));
        return null;
    }

    public write()

    public boolean delete(int start, int offset) {
        block_ptr = (int)(start/1024);
        offset_ptr = start % 1024;
        content[block_ptr++].free(offset_ptr, 1024-offset_ptr);
        for (int i = 2048 - offset_ptr; i < offset; i += 1024)
            content[block_ptr++].free(0, 1024);
        content[block_ptr].free(0, (offset + start - 1) % 1024 + 1);
    }

    public ArrayList<ByteBuffer> read(int classNum, int tuple_length, int offset_in_tuple, ByteBuffer content){
        int start = classNum * class_limit;
        int attribute_length = content.capacity;
        ByteBuffer tmp = ByteBuffer.allocateDirect(tuple_length);
        ArrayList<ByteBuffer> rlt = new ArrayList<ByteBuffer>();
        for (int i = start; i < start + class_limit; i += tuple_length)
            if (read(i + j + offset_in_tuple, attribute_length).equals(content)) {
                tmp = read(i + j, tuple_length);
                rlt.append(tmp);
                tmp = ByteBuffer.allocateDirect(tuple_length);
            }
        return rlt;
    }

    public boolean delete(int classNum, int tuple_length, int offset_in_tuple, ByteBuffer content){
        int start = classNum * class_limit;
        int attribute_length = content.capacity;
        for (int i = start; i < start + class_limit; i += tuple_length)
            if (read(i + j + offset_in_tuple, attribute_length).equals(content))
                delete(i + j, tuple_length);
        return true;
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

    private void updateUsed() {
        for (int i = 0; i < 8192; i++)
            for (int j = 0; j < 1024; j++)
                used_map[i][j] = content[i].used_show[j];
    }

	/*
	public void main(String[] args) {
		boolean [] a = used_map[3000];
		System.out.print(a[0]);
	}
	*/
}
