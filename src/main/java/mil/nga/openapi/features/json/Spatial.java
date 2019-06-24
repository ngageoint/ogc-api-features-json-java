package mil.nga.openapi.features.json;

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
	 * West, south, east, north edges of the bounding box. The coordinates are
	 * in the coordinate reference system specified in `crs`. By default this is
	 * WGS 84 longitude/latitude.
	 */
	private List<Double> bbox = new ArrayList<>();

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
	 * Get the bounding box
	 * 
	 * @return bounding box
	 */
	public List<Double> getBbox() {
		return bbox;
	}

	/**
	 * Set the bounding box
	 * 
	 * @param bbox
	 *            bounding box
	 */
	public void setBbox(List<Double> bbox) {
		this.bbox = bbox;
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
