public class test222{
	public static void main(String []args){
		for(int i =0;i<70;i++){
			System.out.print("successe-");
			System.out.println(i);
			try{
				Thread.sleep(300);
			}catch(Exception e){
				System.exit(0);
			}
		}
		System.out.println("Task was successed!");
	}
}