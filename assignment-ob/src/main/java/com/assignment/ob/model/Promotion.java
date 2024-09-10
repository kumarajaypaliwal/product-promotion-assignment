package com.assignment.ob.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonDeserialize(as = Promotion.class)
public class Promotion {
	@JsonProperty("id")
	@NotNull(message = "Product name cannot be null")
    @Size(min = 1, message = "Product name must have at least 1 character")
	private String id;
	
	@JsonProperty("quantity")
	private int quantity;
	
	public Promotion(String id, int quantity) {
		this.id = id;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
