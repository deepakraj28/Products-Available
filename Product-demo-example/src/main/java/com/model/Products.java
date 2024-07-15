package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_info")

public class Products {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="product_id")
		private int id;
		public Products() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAvailable() {
			return available;
		}
		public void setAvailable(int available) {
			this.available = available;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@Column(name="product_name")
		private String name;
		@Column(name="product_available")
		private int available;
		@Column(name="product_price")
		private float price;
		
}
