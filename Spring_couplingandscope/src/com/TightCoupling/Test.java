package 
com.TightCoupling;
//when tightcoupling occurs means we need to change in java class and recompile again
public class Test {
	public static void main(String[] args) {
		/*Oracle o=new Oracle();
		o.getConnection();*/
		
		MySql sql=new MySql();
		sql.getConnection();
	}

}
