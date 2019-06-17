import java.lang.Math;
public class Robert_Johnson_Pathagorean_Theorem{
	public double calculateHypotenuse(int legA, int legB){
		double c = Math.sqrt((legA * legA) + (legB * legB));
		return c;
	}
}