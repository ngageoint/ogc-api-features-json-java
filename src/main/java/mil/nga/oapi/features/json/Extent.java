package mil.nga.oapi.features.json;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The extent of the features in the collection. In the Core only spatial and
 * temporal extents are specified. Extensions may add additional members to
 * represent other extents, for example, thermal or pressure ranges.
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "spatial", "temporal" })
public class Extent extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The spatial extent of the features in the collection.
	 */
	private Spatial spatial;

	/**
	 * The temporal extent of the features in the collection.
	 */
	private Temporal temporal;

	/**
	 * Constructor
	 */
	public Extent() {

	}

	/**
	 * Get the spatial extent
	 * 
	 * @return spatial extent
	 */
	public Spatial getSpatial() {
		return spatial;
	}

	/**
	 * Set the spatial extent
	 * 
	 * @param spatial
	 *            spatial extent
	 */
	public void setSpatial(Spatial spatial) {
		this.spatial = spatial;
	}

	/**
	 * Get the temporal extent
	 * 
	 * @return temporal begin and end times
	 */
	public Temporal getTemporal() {
		return temporal;
	}

	/**
	 * Set the temporal extent
	 * 
	 * @param temporal
	 *            temporal extent
	 */
	public void setTemporal(Temporal temporal) {
		this.temporal = temporal;
	}

}
