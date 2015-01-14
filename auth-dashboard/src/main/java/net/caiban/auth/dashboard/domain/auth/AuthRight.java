package net.caiban.auth.dashboard.domain.auth;

import java.util.Date;

/**
 * AuthRight generated by MyEclipse Persistence Tools
 */

public class AuthRight implements java.io.Serializable {

	// Fields

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	private String name;
	private Integer sort;
	private String content;
	private String menu;
	private String menuUrl;
	private String menuCss;
	private Date gmtCreated;
	private Date gmtModified;

	// Constructors


	/** default constructor */
	public AuthRight() {
	}

	/**
	 * @param code
	 * @param name
	 * @param sort
	 * @param content
	 * @param menu
	 * @param menuUrl
	 * @param menuCss
	 * @param gmtCreated
	 * @param gmtModified
	 */
	public AuthRight(String code, String name, Integer sort, String content,
			String menu, String menuUrl, String menuCss, Date gmtCreated,
			Date gmtModified) {
		super();
		this.code = code;
		this.name = name;
		this.sort = sort;
		this.content = content;
		this.menu = menu;
		this.menuUrl = menuUrl;
		this.menuCss = menuCss;
		this.gmtCreated = gmtCreated;
		this.gmtModified = gmtModified;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sort
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * @param sort the sort to set
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the menu
	 */
	public String getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}

	/**
	 * @return the menuUrl
	 */
	public String getMenuUrl() {
		return menuUrl;
	}

	/**
	 * @param menuUrl the menuUrl to set
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	/**
	 * @return the menuCss
	 */
	public String getMenuCss() {
		return menuCss;
	}

	/**
	 * @param menuCss the menuCss to set
	 */
	public void setMenuCss(String menuCss) {
		this.menuCss = menuCss;
	}

	/**
	 * @return the gmtCreated
	 */
	public Date getGmtCreated() {
		return gmtCreated;
	}

	/**
	 * @param gmtCreated the gmtCreated to set
	 */
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	/**
	 * @return the gmtModified
	 */
	public Date getGmtModified() {
		return gmtModified;
	}

	/**
	 * @param gmtModified the gmtModified to set
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	

}