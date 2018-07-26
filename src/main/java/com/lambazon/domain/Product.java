package com.lambazon.domain;

public class Product {

	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

    /**
     * Display the quantity only if it's greater than or equal to zero (return 0 for negative number)
     * @param quantity
     */
	public void setQuantity(int quantity) {
        if (quantity > 0) {
            System.out.println(this.quantity = quantity);
        } else {
            System.out.println(0);
        }
    }

	public double getPrice() {
		return price;
	}

    /**
     * Display the price only if it's between 0 and 1000 (return 0 for negative number or 1000 for number >1000)
     * @param price
     */
	public void setPrice(double price) {
        if (price > 0 && price <= 1000) {
            System.out.println(this.price = price);
        } else if (price > 1000) {
            System.out.println(this.price = 1000);
        } else {
            System.out.println(0);
        }
    }


	/**
	 * Display inventory price for each product
	 * @return the inventory price which is quantity * price
	 */
	public double getInventoryPrice() {
		return quantity * price;
	}
}

