/**
 * 
 */
package com.onevision.filechecker.knowledge.rest.model;

import lombok.Data;

/**
 * Error details if something goes wrong.
 */
@Data
public class ErrorResponse {
	private String summary;
	private String description;
	private String trace;
}
