package mil.nga.oapi.features.json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Coordinate Reference System
 * 
 * http://www.opengis.net/def/crs/{authority}/{version}/{code}
 * 
 * @author osbornb
 */
public class Crs {

	/**
	 * CRS pattern
	 */
	public static final Pattern PATTERN = Pattern
			.compile("http.+/([^/]+)/([^/]+)/([^/]+)$");

	/**
	 * CRS pattern authority group
	 */
	public static final int PATTERN_AUTHORITY_GROUP = 1;

	/**
	 * CRS pattern code group
	 */
	public static final int PATTERN_VERSION_GROUP = 2;

	/**
	 * CRS pattern code group
	 */
	public static final int PATTERN_CODE_GROUP = 3;

	/**
	 * Base CRS URL
	 */
	public static final String BASE_URL = "http://www.opengis.net/def/crs";

	/**
	 * CRS Authority
	 */
	private String authority;

	/**
	 * CRS Version
	 */
	private String version;

	/**
	 * CRS Code
	 */
	private String code;

	/**
	 * Constructor
	 */
	public Crs() {

	}

	/**
	 * Constructor
	 * 
	 * @param crs
	 *            CRS URL
	 */
	public Crs(String crs) {
		setCrs(crs);
	}

	/**
	 * Constructor
	 * 
	 * @param authority
	 *            authority
	 * @param version
	 *            version
	 * @param code
	 *            code
	 */
	public Crs(String authority, String version, String code) {
		this.authority = authority;
		this.version = version;
		this.code = code;
	}

	/**
	 * Set the CRS
	 * 
	 * @param crs
	 *            CRS URL
	 * @return true if a valid CRS and values were set
	 */
	public boolean setCrs(String crs) {

		boolean valid = false;

		Matcher matcher = PATTERN.matcher(crs);
		if (matcher.find()) {
			authority = matcher.group(PATTERN_AUTHORITY_GROUP);
			version = matcher.group(PATTERN_VERSION_GROUP);
			code = matcher.group(PATTERN_CODE_GROUP);
			valid = true;
		}

		return valid;
	}

	/**
	 * Get the authority
	 * 
	 * @return authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * Set the authority
	 * 
	 * @param authority
	 *            authority
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * Get the version
	 * 
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the version
	 * 
	 * @param version
	 *            version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Get the code
	 * 
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Set the code
	 * 
	 * @param code
	 *            code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Determine if all parts of the CRS are set
	 * 
	 * @return true if valid
	 */
	public boolean isValid() {
		return authority != null && version != null && code != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return BASE_URL + "/" + authority + "/" + version + "/" + code;
	}

}
