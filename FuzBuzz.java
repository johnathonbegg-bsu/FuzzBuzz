package fuzzbuzz;

public class FuzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++){
			String[] words = {"fuzz", "buzz"};
			int[] num = {3,5};
			
			String out = "";
			for(int j = 0; j< words.length; j++){
				if(i%num[j]==0){
					out+= words[j];
				}
			}
			
			if(out.equals("")){
				System.out.println(i);
			}
		}

	}

}
