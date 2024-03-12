package mil.nga.oapi.features.json;

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
	 * One or more time intervals that describe the temporal extent of the
	 * dataset. The value `null` is supported and indicates an unbounded
	 * interval end. In the Core only a single time interval is supported.
	 * Extensions may support multiple intervals. If multiple intervals are
	 * provided, the union of the intervals describes the temporal extent.
	 */
	private List<List<String>> interval = new ArrayList<>();

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
	public List<List<String>> getInterval() {
		return interval;
	}

	/**
	 * Set the interval
	 * 
	 * @param interval
	 *            interval
	 */
	public void setInterval(List<List<String>> interval) {
		this.interval = interval;
	}

	/**
	 * Add an interval
	 * 
	 * @param interval
	 *            single interval
	 */
	public void addInterval(List<String> interval) {
		this.interval.add(interval);
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
