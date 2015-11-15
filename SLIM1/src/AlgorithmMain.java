/**
 * @author Sandeep Sasidharan
 *
 */
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import Graph.DirectedEdge;
import Graph.GraphNode;
import Graph.RoadGraph;


public class AlgorithmMain {
	
	public static void main(String[] args) throws Exception {
		PrintStream out = new PrintStream(new FileOutputStream("F:/Grapher.txt"));
		System.setOut(out);
		System.out.println("Graphing Started");
		RoadGraph g = new RoadGraph();

		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);
		XmlPullParser xpp = factory.newPullParser();
		xpp.setInput ( new FileReader ("Data/NYRoads.osm"));
		g.osmGraphParser(xpp);
		
		
		
		System.out.println("Graphing Done");
		
		LinkedList<GraphNode> nodes = g.nodes;
		LinkedList<DirectedEdge> edges = g.edges;
		
		ListIterator<DirectedEdge> listIterator = edges.listIterator();
		 while (listIterator.hasNext()) {
	            System.out.println(listIterator.next().from().getId()+"-->"+listIterator.next().to().getId());
	            System.out.println(listIterator.next().getType()+"***"+listIterator.next().speedMax()+"***"+listIterator.next().isOneway()+"\n");
	        }
		
	}

}