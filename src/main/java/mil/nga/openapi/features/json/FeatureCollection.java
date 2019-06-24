package mil.nga.openapi.features.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Feature Collection
 * 
 * @author osbornb
 */
public class FeatureCollection {

	/**
	 * Links property name
	 */
	public static final String LINKS = "links";

	/**
	 * Time Stamp property name
	 */
	public static final String TIME_STAMP = "timeStamp";

	/**
	 * Number Matched property name
	 */
	public static final String NUMBER_MATCHED = "numberMatched";

	/**
	 * Number Returned property name
	 */
	public static final String NUMBER_RETURNED = "numberReturned";

	/**
	 * Link relation for next
	 */
	public static final String LINK_RELATION_NEXT = "next";

	/**
	 * Limit default
	 */
	public static final int LIMIT_DEFAULT = 10;

	/**
	 * Feature collection
	 */
	private mil.nga.sf.geojson.FeatureCollection featureCollection;

	/**
	 * Constructor
	 */
	public FeatureCollection() {
		featureCollection = new mil.nga.sf.geojson.FeatureCollection();
	}

	/**
	 * Constructor
	 * 
	 * @param featureCollection
	 *            feature collection
	 */
	public FeatureCollection(
			mil.nga.sf.geojson.FeatureCollection featureCollection) {
		this.featureCollection = featureCollection;
	}

	/**
	 * Get the feature collection
	 * 
	 * @return feature collection
	 */
	public mil.nga.sf.geojson.FeatureCollection getFeatureCollection() {
		return featureCollection;
	}

	/**
	 * Set the feature collection
	 * 
	 * @param featureCollection
	 *            feature collection
	 */
	public void setFeatureCollection(
			mil.nga.sf.geojson.FeatureCollection featureCollection) {
		this.featureCollection = featureCollection;
	}

	/**
	 * Get the links
	 * 
	 * @return collection of links
	 */
	public List<Link> getLinks() {
		return Link.toLinks(featureCollection.getForeignMember(LINKS));
	}

	/**
	 * Set the links
	 * 
	 * @param links
	 *            collection of links
	 */
	public void setLinks(Collection<Link> links) {
		featureCollection.setForeignMember(LINKS, links);
	}

	/**
	 * Get a mapping between link relations and links
	 * 
	 * @return relation links
	 */
	public Map<String, List<Link>> getRelationLinks() {
		Map<String, List<Link>> links = new HashMap<>();
		List<Link> allLinks = getLinks();
		if (allLinks != null) {
			for (Link link : allLinks) {
				String relation = link.getRel();
				List<Link> relationLinks = links.get(relation);
				if (relationLinks == null) {
					relationLinks = new ArrayList<>();
					links.put(relation, relationLinks);
				}
				relationLinks.add(link);
			}
		}
		return links;
	}

	/**
	 * Get the time stamp
	 * 
	 * @return time stamp
	 */
	public String getTimeStamp() {
		return (String) featureCollection.getForeignMember(TIME_STAMP);
	}

	/**
	 * Set the time stamp
	 * 
	 * @param timeStamp
	 *            time stamp
	 */
	public void setTimeStamp(String timeStamp) {
		featureCollection.setForeignMember(TIME_STAMP, timeStamp);
	}

	/**
	 * Get the number matched
	 * 
	 * @return number matched
	 */
	public Integer getNumberMatched() {
		return (Integer) featureCollection.getForeignMember(NUMBER_MATCHED);
	}

	/**
	 * Set the number matched
	 * 
	 * @param numberMatched
	 *            number matched
	 */
	public void setNumberMatched(Integer numberMatched) {
		featureCollection.setForeignMember(NUMBER_MATCHED, numberMatched);
	}

	/**
	 * Get the number returned
	 * 
	 * @return number returned
	 */
	public Integer getNumberReturned() {
		return (Integer) featureCollection.getForeignMember(NUMBER_RETURNED);
	}

	/**
	 * Set the number returned
	 * 
	 * @param numberReturned
	 *            number returned
	 */
	public void setNumberReturned(Integer numberReturned) {
		featureCollection.setForeignMember(NUMBER_RETURNED, numberReturned);
	}

}
