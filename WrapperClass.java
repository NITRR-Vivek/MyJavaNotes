//Wrapper classes in java : 
// Boolean, Character, Byte, Short, Integer, Long, Float, Double
class WrapperClass 
{
	public static void main (String []args){
		int x = Integer.parseInt("123");
		Integer x1 = Integer.valueOf("10111",2);
		int y1 = x1.intValue();
		Double x2 = Double.valueOf("56");
		double y2 = x2.doubleValue();
		
		System.out.println(x);
		System.out.println(y1);
		System.out.println(y2);
	}
}