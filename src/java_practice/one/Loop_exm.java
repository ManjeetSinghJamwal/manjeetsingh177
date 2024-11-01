package java_practice.one;

public class Loop_exm {
	public void w_method() {
		int i=0;
		while(i<6) {System.out.println("While_Loop"+i);
		i++;
		}
	}
	public void f_method() {
		for(int i=6;i>0;i--) {
			System.out.println("For_Loop"+i);
		}}
		public void e_method() {
			int[] a= {4,5,6,7};
			for(int av:a) {
				System.out.println("For Each"+av);
			}
		}
		
	
	public static void main(String[] args) throws Exception{
	Loop_exm wl=new Loop_exm();
	wl.w_method();
	System.out.println("******************");
	wl.f_method();
	System.out.println("******************");
	wl.e_method();
	}

}
