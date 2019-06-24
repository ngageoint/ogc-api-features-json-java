package mil.nga.openapi.features.json;

import com.fasterxml.jackson.databind.JsonNode;

import mil.nga.sf.geojson.FeatureConverter;

/**
 * Features Converter
 * 
 * @author osbornb
 */
public class FeaturesConverter {

	/**
	 * Convert the string content to a collections
	 * 
	 * @param content
	 *            string content
	 * @return collections
	 */
	public static Collections toCollections(String content) {
		return FeatureConverter.toTypedObject(Collections.class, content);
	}

	/**
	 * Convert the object value to a collections
	 * 
	 * @param value
	 *            object value
	 * @return collections
	 */
	public static Collections toCollections(Object value) {
		return FeatureConverter.toTypedObject(Collections.class, value);
	}

	/**
	 * Convert the JSON tree to a collections
	 * 
	 * @param tree
	 *            tree node
	 * @return collections
	 */
	public static Collections toCollections(JsonNode tree) {
		return FeatureConverter.toTypedObject(Collections.class, tree);
	}

	/**
	 * Convert the string content to a collection
	 * 
	 * @param content
	 *            string content
	 * @return collection
	 */
	public static Collection toCollection(String content) {
		return FeatureConverter.toTypedObject(Collection.class, content);
	}

	/**
	 * Convert the object value to a collection
	 * 
	 * @param value
	 *            object value
	 * @return collection
	 */
	public static Collection toCollection(Object value) {
		return FeatureConverter.toTypedObject(Collection.class, value);
	}

	/**
	 * Convert the JSON tree to a collection
	 * 
	 * @param tree
	 *            tree node
	 * @return collection
	 */
	public static Collection toCollection(JsonNode tree) {
		return FeatureConverter.toTypedObject(Collection.class, tree);
	}

	/**
	 * Convert the string content to a feature collection
	 * 
	 * @param content
	 *            string content
	 * @return feature collection
	 */
	public static FeatureCollection toFeatureCollection(String content) {
		return new FeatureCollection(
				FeatureConverter.toFeatureCollection(content));
	}

	/**
	 * Convert the object value to a feature collection
	 * 
	 * @param value
	 *            object value
	 * @return feature collection
	 */
	public static FeatureCollection toFeatureCollection(Object value) {
		return new FeatureCollection(
				FeatureConverter.toFeatureCollection(value));
	}

	/**
	 * Convert the JSON tree to a feature collection
	 * 
	 * @param tree
	 *            tree node
	 * @return feature collection
	 */
	public static FeatureCollection toFeatureCollection(JsonNode tree) {
		return new FeatureCollection(
				FeatureConverter.toFeatureCollection(tree));
	}

	/**
	 * Convert a simple geometry to a feature collection
	 * 
	 * @param simpleGeometry
	 *            simple geometry
	 * @return feature collection
	 */
	public static FeatureCollection toFeatureCollection(
			mil.nga.sf.Geometry simpleGeometry) {
		return new FeatureCollection(
				FeatureConverter.toFeatureCollection(simpleGeometry));
	}

	/**
	 * Convert simple geometries to a feature collection
	 * 
	 * @param simpleGeometries
	 *            simple geometries
	 * @return feature collection
	 */
	public static FeatureCollection toFeatureCollection(
			java.util.Collection<mil.nga.sf.Geometry> simpleGeometries) {
		return new FeatureCollection(
				FeatureConverter.toFeatureCollection(simpleGeometries));
	}

	/**
	 * Convert the feature collection to a string value
	 * 
	 * @param featureCollection
	 *            feature collection
	 * @return string value
	 */
	public static String toStringValue(FeatureCollection featureCollection) {
		return toStringValue(featureCollection.getFeatureCollection());
	}

	/**
	 * Convert the object to a string value
	 * 
	 * @param object
	 *            object
	 * @return string value
	 */
	public static String toStringValue(Object object) {
		return FeatureConverter.toStringValue(object);
	}

}
