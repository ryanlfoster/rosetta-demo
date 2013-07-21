package com.rosetta.demo.components.generic.entity;

import javax.servlet.jsp.PageContext;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.scripting.SlingScriptHelper;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.designer.Style;

/**
 * Generic configuration class for the UI components.
 */
public class GenericConfiguration {

	/**
	 * SlingHttpServletRequest reference.
	 */
	protected SlingHttpServletRequest request;
	
	/**
	 * SlingHttpServletResponse reference.
	 */
	protected SlingHttpServletResponse response;

	/**
	 * com.day.cq.wcm.api.Page page.
	 */
	protected Page page;

	/**
	 * ResourceResolver reference.
	 */
	protected ResourceResolver resolver;
	
	/**
	 * PageManager reference.
	 */
	protected PageManager pageManager;

	/**
	 * PageContext reference.
	 */
	protected PageContext pageContext;

	/**
	 * Style reference.
	 */
	protected Style currentStyle;
	
	/**
	 * properties reference.
	 */
	protected ValueMap properties;
	
	/**
	 * SlingScriptHelper reference.
	 */	
	protected SlingScriptHelper slingHelper;

	/**
	 * Default constructor method.
	 */
	public GenericConfiguration() {
		super();
	}

	/**
	 * @return the request
	 */
	public SlingHttpServletRequest getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(SlingHttpServletRequest request) {
		this.request = request;
	}

	/**
	 * @return the response
	 */
	public SlingHttpServletResponse getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(SlingHttpServletResponse response) {
		this.response = response;
	}

	/**
	 * @return the page
	 */
	public Page getPage() {
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(Page page) {
		this.page = page;
	}

	/**
	 * @return the resolver
	 */
	public ResourceResolver getResolver() {
		return resolver;
	}

	/**
	 * @param resolver the resolver to set
	 */
	public void setResolver(ResourceResolver resolver) {
		this.resolver = resolver;
	}

	/**
	 * @return the pageManager
	 */
	public PageManager getPageManager() {
		return pageManager;
	}

	/**
	 * @param pageManager the pageManager to set
	 */
	public void setPageManager(PageManager pageManager) {
		this.pageManager = pageManager;
	}

	/**
	 * @return the pageContext
	 */
	public PageContext getPageContext() {
		return pageContext;
	}

	/**
	 * @param pageContext the pageContext to set
	 */
	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	/**
	 * @return the currentStyle
	 */
	public Style getCurrentStyle() {
		return currentStyle;
	}

	/**
	 * @param currentStyle the currentStyle to set
	 */
	public void setCurrentStyle(Style currentStyle) {
		this.currentStyle = currentStyle;
	}
	
	/**
	 * @return the properties
	 */
	public ValueMap getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(ValueMap properties) {
		this.properties = properties;
	}

	/**
	 * @return the slingHelper
	 */
	public SlingScriptHelper getSlingHelper() {
		return slingHelper;
	}

	/**
	 * @param slingHelper the slingHelper to set
	 */
	public void setSlingHelper(SlingScriptHelper slingHelper) {
		this.slingHelper = slingHelper;
	}

}
