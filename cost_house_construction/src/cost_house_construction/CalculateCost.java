package cost_house_construction;

public class CalculateCost {
	
   public double calc_cost(String material,double area,boolean automated)
   {
	   double ans=1;//store answer
	   if(material.compareTo("standard")==0)
	   {
		   ans=1200*area;
	   }
	   else if(material.compareTo("abovestandard")==0)
	   {
		   ans=1500*area;
	   }
	   else if(material.compareTo("highstandard")==0)
	   {
		   if(automated)
		   {
			   ans=2500*area;
		   }
		   else
		   {
			   ans=1800*area;
		   }
	   }
	   return ans;
   }
}
