package mil.nga.oapi.features.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The spatial extent of the features in the collection.
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "bbox", "crs" })
public class Spatial extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * One or more bounding boxes that describe the spatial extent of the
	 * dataset. In the Core only a single bounding box is supported. Extensions
	 * may support additional areas. If multiple areas are provided, the union
	 * of the bounding boxes describes the spatial extent.
	 */
	private List<List<Double>> bbox = new ArrayList<>();

	/**
	 * Coordinate reference system of the coordinates in the spatial extent
	 * (property `bbox`). The default reference system is WGS 84
	 * longitude/latitude. In the Core this is the only supported coordinate
	 * reference system. Extensions may support additional coordinate reference
	 * systems and add additional enum values.
	 */
	private String crs;

	/**
	 * Constructor
	 */
	public Spatial() {

	}

	/**
	 * Get the bounding box collection
	 * 
	 * @return bounding box collection
	 * @since 3.0.0
	 */
	public List<List<Double>> getBbox() {
		return bbox;
	}

	/**
	 * Set the bounding box collection
	 * 
	 * @param bbox
	 *            bounding box collection
	 * @since 3.0.0
	 */
	public void setBbox(List<List<Double>> bbox) {
		this.bbox = bbox;
	}

	/**
	 * Get the bounding box collection count
	 * 
	 * @return count
	 * @since 3.0.0
	 */
	public int bboxCount() {
		return this.bbox.size();
	}

	/**
	 * Get the first bounding box
	 * 
	 * @return bounding box
	 * @since 3.0.0
	 */
	public List<Double> firstBbox() {
		return getBbox(0);
	}

	/**
	 * Get the bounding box at the index
	 * 
	 * @param index
	 *            0 based index
	 * @return bounding box
	 * @since 3.0.0
	 */
	public List<Double> getBbox(int index) {
		return this.bbox.get(index);
	}

	/**
	 * Add a bounding box
	 * 
	 * @param bbox
	 *            single bounding box
	 * @since 3.0.0
	 */
	public void addBbox(List<Double> bbox) {
		this.bbox.add(bbox);
	}

	/**
	 * Get the coordinate reference system
	 * 
	 * @return coordinate reference system
	 */
	public String getCrs() {
		return crs;
	}

	/**
	 * Set the coordinate reference system
	 * 
	 * @param crs
	 *            coordinate reference system
	 */
	public void setCrs(String crs) {
		this.crs = crs;
	}

}
