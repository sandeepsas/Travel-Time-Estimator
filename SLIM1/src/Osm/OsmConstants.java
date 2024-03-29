package Osm;

public class OsmConstants {

	/*LatLong for LaG airport*/
	public static double LaG_lat = 40.776927;
	public static double LaG_lng = -73.873966;
	public static String API_KEY = "AIzaSyAkBR5OFsUz1Np0Rg1bJSyb4ObuXYF4to4";


	public static int roadTypeToSpeed(String type)
	{
		int speed=0;
		switch (type)
		{
		case "primary":
			speed =40;
			break;
		case "secondary":
			speed =40;
			break;
		case "teritiary":
			speed =35;
			break;
		case "primary_link":
			speed =35;
			break;
		case "secondary_link":
			speed =35;
			break;
		case "teritiary_link":
			speed =35;
			break;
		case "residential":
			speed =20;
			break;
		case "unclassified":
			speed =20;
			break;
		case "road":
			speed =20;
			break;
		case "living street":
			speed =20;
			break;
		case "motorway":
			speed =65;
			break;
		case "motorway_link":
			speed =35;
			break;
		case "trunk":
			speed =30;
			break;
		case "trunk_link":
			speed =35;
			break;
		default:
			speed =20;

		}
		return speed;
	}
}
