public class SquareRoot {

	public static void main(String[] args) {
		double a = 3;
    double b = 2.5;
    double c = -0.5;

		double discriminant = b * b - 4 * a * c;

    if (discriminant > 0 & (a == 0 & b!= 0 & c == 0) ) {
      
      System.out.println("x1=" + 0.0 );
			System.out.println("x2=" + 0.0 );
		}

    else if (discriminant == 0 & (a == 0 && b == 0 && c != 0)) {
      
      System.out.println("x1="  );
			System.out.println("x2="  );
    }

    else if (discriminant == 0 & (a == 0 & b == 0 & c == 0) ) {
      
      System.out.println("x1="  );
			System.out.println("x2="  );
		}

    else if ((discriminant > 0) ) {

			double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}

    else if (discriminant == 0) {

      double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x1);
    }		    
    
		else if (discriminant < 0) {

			System.out.println("x1=" );
			System.out.println("x2=" );
		}    
	}
}
