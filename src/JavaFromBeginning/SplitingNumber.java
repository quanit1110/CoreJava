package JavaFromBeginning;

public class SplitingNumber {

	public static void main(String[] args) {
		int target = 123456;
		int [] ara = new int [6];
//		for (int i = 0; i <ara.length; i++){
//			ara[i]= target % 10;
//					target = target %10;
//
//		}			System.out.print( target + " ");

		int rem, i = 0;
		do{
			rem = target % 10;
			ara[i] = rem;
			i++;
			target = target/10;
		}while(target>0);
		
		for(int arrEle : ara){//for each
			System.out.println(arrEle);
		}
		
	}


}
