package mil.nga.openapi.features.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Collection
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "id", "title", "description", "links", "extent", "crs",
		"itemType" })
public class Collection extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identifier of the collection used
	 */
	private String id;

	/**
	 * Human readable title of the collection
	 */
	private String title;

	/**
	 * A description of the features in the collection
	 */
	private String description;

	/**
	 * Collection of links
	 */
	private List<Link> links = new ArrayList<>();

	/**
	 * Extent
	 */
	private Extent extent;

	/**
	 * The list of coordinate reference systems supported by the service; the
	 * first item is the default coordinate reference system
	 */
	private List<String> crs = new ArrayList<>();

	/**
	 * Indicator about the type of the items in the collection (the default
	 * value is 'feature')
	 */
	private String itemType;

	/**
	 * Constructor
	 */
	public Collection() {

	}

	/**
	 * Constructor
	 * 
	 * @param id
	 *            id
	 */
	public Collection(String id) {
		this.id = id;
	}

	/**
	 * Get the id
	 * 
	 * @return id
	 */
	@JsonInclude(JsonInclude.Include.ALWAYS)
	public String getId() {
		return id;
	}

	/**
	 * Set the id
	 * 
	 * @param id
	 *            id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get the title
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the title
	 * 
	 * @param title
	 *            title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get the description
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description
	 * 
	 * @param description
	 *            description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the links
	 * 
	 * @return links
	 */
	@JsonInclude(JsonInclude.Include.ALWAYS)
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
	 * Get the extent
	 * 
	 * @return extent
	 */
	public Extent getExtent() {
		return extent;
	}

	/**
	 * Set the extent
	 * 
	 * @param extent
	 *            extent
	 */
	public void setExtent(Extent extent) {
		this.extent = extent;
	}

	/**
	 * Get the crs
	 * 
	 * @return crs list
	 */
	public List<String> getCrs() {
		return crs;
	}

	/**
	 * Set the crs
	 * 
	 * @param crs
	 *            crs list
	 */
	public void setCrs(List<String> crs) {
		this.crs = crs;
	}

	/**
	 * Add a crs
	 * 
	 * @param crs
	 *            crs
	 */
	public void addCrs(String crs) {
		this.crs.add(crs);
	}

	/**
	 * Get the item type
	 * 
	 * @return item type
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * Set the item type
	 * 
	 * @param itemType
	 *            item type
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
