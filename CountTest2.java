public class CountTest{
	public static void main(String []args){
		for(int i =0;i<60;i++){
			System.out.println(i+1);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}