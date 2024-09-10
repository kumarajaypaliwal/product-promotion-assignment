package com.assignment.ob.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product {
	@JsonProperty("id")
	@NotNull(message = "Product name cannot be null")
    @Size(min = 1, message = "Product name must have at least 1 character")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
