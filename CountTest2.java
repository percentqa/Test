public class CountTest2{
	public static void main(String []args){
		for(int i =0;i<60;i++){
			System.out.print("test-");
			System.out.println(i*2+1);
			try{
				Thread.sleep(150);
			}catch(Exception e){
				System.exit(0);
			}
		}
		System.out.println("Task was successed!");
	}
}