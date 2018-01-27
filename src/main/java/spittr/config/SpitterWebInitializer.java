package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import web.WebConfig;

/**
 * 
 * This class is to configure DispatcherServlet in servlet container
 * 
 * @author Abhinav
 *
 */

public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	/**
	 * This method lets DispatcherServlet loads its application context with beans
	 * defined in webConfig confirguration class.
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	/**
	 * This method identifies one or more path (in array) that dispatcherServlet
	 * will be mapped to.
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
