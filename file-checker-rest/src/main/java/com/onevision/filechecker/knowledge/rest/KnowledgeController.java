/**
 * 
 */
package com.onevision.filechecker.knowledge.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onevision.filechecker.knowledge.rest.model.KnowledgeResponse;
import com.onevision.filechecker.knowledge.rest.model.Summary;

/**
 * RESTful controller for the knowledge service.
 */
@RestController
public class KnowledgeController {
	
	@RequestMapping(name = "", method=RequestMethod.GET)
	public ResponseEntity<KnowledgeResponse<Summary>> displayOverview() {
		KnowledgeResponse<Summary> body = new KnowledgeResponse<Summary>(new Summary("System is running...."));
		return new ResponseEntity<KnowledgeResponse<Summary>>(body, HttpStatus.OK);
	}
}
