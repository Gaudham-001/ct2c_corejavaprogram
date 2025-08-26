package day19;

public class WithoutLambdaExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStatement s=new IStatement() {
        	public String show()
        	{
        		return "Welcome to Lambda Expression";
        	}};
        	
        	System.out.println(s.show());

	}

}
