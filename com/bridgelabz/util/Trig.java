/****************************************************************************** 
 *  Purpose: converts the given degree into radians and then perform various trignometric operations.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
class Trig {
	static double degree,radians,sin,cos,tan,r;
 	public static void main(String args[]){
		degree= Double.parseDouble(args[0]);
		radians = Math.toRadians(degree);
		sin = Math.sin(radians);
		System.out.println("sin("+degree+") = " +sin);
		cos = Math.cos(radians);
		System.out.println("cos("+degree+") = " +cos);
		tan = Math.tan(radians);
		System.out.println("tan("+degree+") = " +tan);
		r = sin*sin + cos*cos;
		System.out.println(sin*sin+ "  +  " +cos*cos+ " =  " +r);
	}
 }
