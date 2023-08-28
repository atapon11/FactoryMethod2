import java.io.*;
public class GenerateBill {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
	GetPlanFactory planFactory = new GetPlanFactory();  

	
	System.out.println("Enter name of Plan: ");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String planName = br.readLine();
	
	
	System.out.println("Enter number of units: ");
	int units = Integer.parseInt(br.readLine());
	
	Plan p = planFactory.getPlan(planName);
	System.out.println("Bill amount for "+planName+" of " +units+" units is: ");
	p.getRate();
	p.calculateBill(units);
	}

}
