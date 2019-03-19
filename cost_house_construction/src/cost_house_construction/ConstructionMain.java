package cost_house_construction;

public class ConstructionMain {
	
	public static void main(String[] args)
	{
		CalculateCost calcost=new CalculateCost();
		System.out.println(calcost.calc_cost("highstandard",143,true));
	}

}
