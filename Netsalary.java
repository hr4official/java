class NetSalary
{
	public static void main(String arg[])	
	{
	    double gs,it,pt,pf,netSalary;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Gross salary");
                   gs=sc.nextDouble();
	    System.out.println("Enter Income Tax %");
                   it=sc.nextDouble();
	    System.out.println("Enter Professional Tax %");
                   pt=sc.nextDouble();
	     System.out.println("enter Provident Fund %");
	pf=sc.nextDouble();
	netSalary=salary(gs,pf,pt,it);
	System.out.println("Net Salary is="+netSalary);
	}
static double salary(double gs,double pf,double pt,double it)
	{
	     pf=pf*(gs/100);
	     it=it*(gs/100);
	     pt=pt*(gs/100);
	     double n=gs-it-pt-pf;
	     return n;	     
                   }
}