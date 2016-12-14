package com.sample.product.entity;

public class Product {
	private long ShoppingId;
	
	private long id;
	private String category_id;// 類別
	private String desc;// 商品名稱
	private int inventory;// 庫存
	private int reorderPoint;// 安全庫存量
	private String size;// 產品尺寸
	private String color;// 顏色
	private int price;// 價格
	private int ordernumber;// 訂購數量

	/* getters and setters */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category_id;
	}

	public void setCategory(String category) {
		this.category_id = category;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getReorderPoint() {
		return reorderPoint;
	}

	public void setReorderPoint(int reorderPoint) {
		this.reorderPoint = reorderPoint;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}

	public long getShoppingId() {
		return ShoppingId;
	}

	public void setShoppingId(long shoppingId) {
		ShoppingId = shoppingId;
	}

	

}
