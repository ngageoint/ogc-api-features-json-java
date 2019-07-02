package mil.nga.oapi.features.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.type.TypeReference;

import mil.nga.sf.geojson.FeatureConverter;
import mil.nga.sf.util.SFException;

/**
 * Link
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "href", "rel", "type", "hreflang", "title", "length" })
public class Link extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * href
	 */
	private String href;

	/**
	 * rel
	 */
	private String rel;

	/**
	 * type
	 */
	private String type;

	/**
	 * hreflang
	 */
	private String hreflang;

	/**
	 * title
	 */
	private String title;

	/**
	 * length
	 */
	private Integer length;

	/**
	 * Constructor
	 */
	public Link() {

	}

	/**
	 * Constructor
	 * 
	 * @param href
	 *            href
	 */
	public Link(String href) {
		this.href = href;
	}

	/**
	 * Get the href
	 * 
	 * @return href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * Set the href
	 * 
	 * @param href
	 *            href
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * Get the rel
	 * 
	 * @return rel
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * Set the rel
	 * 
	 * @param rel
	 *            rel
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}

	/**
	 * Get the type
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type
	 * 
	 * @param type
	 *            type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get the href lang
	 * 
	 * @return href lang
	 */
	public String getHreflang() {
		return hreflang;
	}

	/**
	 * Set the href lang
	 * 
	 * @param hreflang
	 *            href lang
	 */
	public void setHreflang(String hreflang) {
		this.hreflang = hreflang;
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
	 * Get the length
	 * 
	 * @return length
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * Set the length
	 * 
	 * @param length
	 *            length
	 */
	public void setLength(Integer length) {
		this.length = length;
	}

	/**
	 * Convert the links object to a list of links
	 * 
	 * @param linksObject
	 *            links object
	 * @return list of links
	 */
	public static List<Link> toLinks(Object linksObject) {

		List<Link> links = null;
		try {
			String linksString = FeatureConverter.mapper
					.writeValueAsString(linksObject);
			links = FeatureConverter.mapper.readValue(linksString,
					new TypeReference<List<Link>>() {
					});
		} catch (Exception e) {
			throw new SFException(
					"Failed to convert links object: " + linksObject, e);
		}

		return links;
	}

}
