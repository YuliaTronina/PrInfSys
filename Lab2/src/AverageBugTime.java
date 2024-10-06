import java.util.List;

public class AverageBugTime {
	public float AverageBugTimeCalc (float c, float k1, List<Integer> bugTime) {
	float t1 = 0;
	t1=1/(k1*(c-bugTime.size()));
	System.out.println ("Среднее время до появления ошибки " + t1);
	return t1;
	}
}
