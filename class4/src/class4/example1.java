package class4;

public class example1 {
	int reg_no;
	String name;
	String stream;
	void setData(){
		reg_no=101;
		name="sravan";
		stream="cse";
	
	}
	void getData(){
	System.out.println(reg_no+"\t"+name+"\t"+stream);
	}
	public static void main(String[] args) {
		example1 example=new example1();
	System.out.println(example.reg_no+"\t"+example.name+"\t"+example.stream);
		example.getData();
		example.setData();
		example.getData();
		
	}

}



