
public class Relasional {
	public static void main (String [] args) {
		boolean True = true;
		boolean False = false;
		//konjungsi 
		System.out.print("True ^ True : ") ;
		System.out.println (True && True ) ;
		System.out.print("True ^ false : ") ;
		System.out.println (True && False ) ;
		System.out.print("false ^ True : ") ;
		System.out.println(False && True ) ;
		System.out.print("false ^ false : ") ;
		System.out.println(False && False ) ;
		System.out.println () ;
		//Diajungsi
		System.out.print("True V True : ") ;
		System.out.println(True || True) ;
		System.out.print("True V False : ") ;
		System.out.println (True || False) ;
		System.out.print("False V True : ") ;
		System.out.println(False || True) ;
		System.out.print("False V False : ") ;
		System.out.println(False || False) ;
		System.out.println () ; 
	}
}