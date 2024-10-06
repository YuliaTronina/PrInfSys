import java.util.List;

public class ScaleFactor {
	
	public float ScaleFactorCalc (float c, List<Integer> bugTime, List<Integer> bugNumber ) {
	float k1 = 0;
	float k2 = 0;
	float partFirstB = 0;
	float partOfPartFirstB = 0;
	float partSecondB = 0;
	float partThirdB = 0;
	
	for (int i = 0; i<bugTime.size(); i++) {
		
		partOfPartFirstB=(c-i)*bugTime.get(i);
		partFirstB = partFirstB+partOfPartFirstB;
		
		partSecondB = partSecondB+bugTime.get(i);
		
		partThirdB = partThirdB+bugNumber.get(i)*bugTime.get(i);
		
		
	
	}
	
		
	k1=bugTime.size()/partFirstB;
	System.out.println ("Коэффициент пропорциональности1 " +k1);
			
	k2=bugTime.size()/((c+1)*partSecondB-partThirdB);
	System.out.println ("Коэффициент пропорциональности2 " +k2);
	
	return k1;

	}
}