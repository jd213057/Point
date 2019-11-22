package point.point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPoint {

	public static void main(String[] args) {
		List<Point> points = new ArrayList<Point>();
		Random random = new Random();
		
		for (int i=0; i<10; i++) {
			int x = random.nextInt(100);
			int y = random.nextInt(100);
			points.add(new Point(x,y));
		}
        points.forEach(s->System.out.println(s));
        points.sort((p1,p2)->p1.getX()-p2.getX());
        points.forEach(System.out::println);
//        for (int i=0; i<10;i++) {
//        int i = compare(points.get(i), points.get(i+1));
//	}
	}
}
