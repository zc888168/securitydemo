/**
 * 
 */
package com.whale.security.core.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author zhailiang
 *
 */
public interface ValidateCodeGenerator {

	ImageCode generate(ServletWebRequest request);
	
}
