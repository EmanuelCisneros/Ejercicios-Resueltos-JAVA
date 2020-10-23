public class EliminaElementosRepetidos{
	public static void main(String[] args)
	{
		String arraycar[]={"4","1","2","6","7","2","2","5","5","6","2","4","2"};
 
		for(int i=0;i<arraycar.length;i++){
			for(int j=0;j<arraycar.length-1;j++){
				if(i!=j){
					if(arraycar[i]==arraycar[j]){
						// eliminamos su valor
						arraycar[i]="";
					}
				}
			}
		}
 
		// mostramos unicamente los que tienen valor
		int n=arraycar.length;
		for (int k=0;k<=n-1;k++){
			if(arraycar[k]!=""){
				System.out.println( arraycar[k]);
			}
		}
	}
}