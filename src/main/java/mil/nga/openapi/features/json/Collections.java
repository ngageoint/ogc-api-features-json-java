package mil.nga.openapi.features.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Content
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "links", "collections" })
@JsonInclude(Include.ALWAYS)
public class Collections extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Collection of links
	 */
	private List<Link> links = new ArrayList<>();

	/**
	 * Collection of collections
	 */
	private List<Collection> collections = new ArrayList<>();

	/**
	 * Constructor
	 */
	public Collections() {

	}

	/**
	 * Get the links
	 * 
	 * @return links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * Set the links
	 * 
	 * @param links
	 *            links
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	/**
	 * Add a link
	 * 
	 * @param link
	 *            link
	 */
	public void addLink(Link link) {
		this.links.add(link);
	}

	/**
	 * Get the collections
	 * 
	 * @return collections
	 */
	public List<Collection> getCollections() {
		return collections;
	}

	/**
	 * Set the collections
	 * 
	 * @param collections
	 *            collections
	 */
	public void setCollections(List<Collection> collections) {
		this.collections = collections;
	}

	/**
	 * Add a collection
	 * 
	 * @param collection
	 *            collection info
	 */
	public void addCollection(Collection collection) {
		this.collections.add(collection);
	}

}
