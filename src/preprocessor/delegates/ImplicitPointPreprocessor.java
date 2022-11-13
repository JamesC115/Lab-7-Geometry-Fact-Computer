package preprocessor.delegates;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import geometry_objects.Segment;
import geometry_objects.points.Point;
import geometry_objects.points.PointDatabase;

public class ImplicitPointPreprocessor
{
	/**
	 * It is possible that some of the defined segments intersect
	 * and points that are not named; we need to capture those
	 * points and name them.
	 * 
	 * Algorithm:
	 *    TODO
	 */
	public static Set<Point> compute(PointDatabase givenPoints, List<Segment> givenSegments)
	{
		//seems very inefficient, talk to Dr.Alvin to try and resolve
		
		Set<Point> implicitPoints = new LinkedHashSet<Point>();

        for(Segment seg1: givenSegments) {
        	for(Segment seg2: givenSegments) {
        		if(seg1.segmentIntersection(seg2) != null) {
        			implicitPoints.add(seg1.segmentIntersection(seg2));
        		}
        	}
        }

		return implicitPoints;
	}

}
