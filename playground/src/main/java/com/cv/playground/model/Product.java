package com.cv.playground.model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Product {
	  @Id
	  public ObjectId _id;
	  
	  public String product_id;
	  public String name;
	  public Double price;
	  
	  // Constructors
	  public Product() {}
	  
	  public Product(ObjectId _id, String product_id, String name, Double price) {
	    this._id = _id;
	    this.product_id = product_id;
	    this.name = name;
	    this.price = price;
	  }
	  
	  public Product(String product_id, String name, Double price) {
		    this.product_id = product_id;
		    this.name = name;
		    this.price = price;
		  }
	   
	  
	  // ObjectId needs to be converted to string
	  public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }
	  
	  public String getProduct_id() {
			return product_id;
		}

		public void setProduct_id(String product_id) {
			this.product_id = product_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}  
}
