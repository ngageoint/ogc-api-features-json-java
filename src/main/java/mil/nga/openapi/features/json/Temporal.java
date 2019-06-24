package mil.nga.openapi.features.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The temporal extent of the features in the collection.
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "interval", "trs" })
public class Temporal {

	/**
	 * Begin and end times of the time interval. The timestamps are in the
	 * coordinate reference system specified in `trs`. By default this is the
	 * Gregorian calendar.
	 */
	private List<String> interval = new ArrayList<>();

	/**
	 * Coordinate reference system of the coordinates in the temporal extent
	 * (property `interval`). The default reference system is the Gregorian
	 * calendar. In the Core this is the only supported temporal reference
	 * system. Extensions may support additional temporal reference systems and
	 * add additional enum values.
	 */
	private String trs;

	/**
	 * Constructor
	 */
	public Temporal() {

	}

	/**
	 * Get the interval
	 * 
	 * @return interval
	 */
	public List<String> getInterval() {
		return interval;
	}

	/**
	 * Set the interval
	 * 
	 * @param interval
	 *            interval
	 */
	public void setInterval(List<String> interval) {
		this.interval = interval;
	}

	/**
	 * Get the Temporal reference system
	 * 
	 * @return temporal reference system
	 */
	public String getTrs() {
		return trs;
	}

	/**
	 * Set the temporal reference system
	 * 
	 * @param trs
	 *            reference system
	 */
	public void setTrs(String trs) {
		this.trs = trs;
	}

}
