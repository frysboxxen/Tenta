import java.awt.*;
public class T16_5{
	public static void main(String[] args) {
		Picture in1 = new Picture(args[0]);
		Picture in2 = new Picture(args[1]);
		Picture out = new Picture(in1.width(), in1.height());
		for (int i = 0; i<in1.width(); i++) {
			for (int j = 0; j<in1.height(); j++) {
				out.set(i,j,combine(in1.get(i,j), in2.get(i,j), Double.parseDouble(args[2])));
			}
		}
		in1.show();
		in2.show();
		out.show();
	}
	public static Color combine(Color c1, Color c2, double alpha){
		int r1 = c1.getRed();
		int g1 = c1.getGreen();
		int b1 = c1.getBlue();

		int r2 = c2.getRed();
		int g2 = c2.getGreen();
		int b2 = c2.getBlue();

		int r = (int)((alpha*r1)+((1-alpha)*r2));
		int g = (int)((alpha*g1)+((1-alpha)*g2));
		int b = (int)((alpha*b1)+((1-alpha)*b2));

		Color c3 = new Color(r,g,b);
		return c3;
	}
}