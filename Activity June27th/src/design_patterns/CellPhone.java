package design_patterns;

import java.util.Objects;

public class CellPhone {
	private String brand;
	private long serialNumber;
	private double price;

	// default Constructor
	public CellPhone() {
		this("CC", 100000000, 999.99);
	}

	// Parameters constructor
	public CellPhone(String br, long sn, double pr) {
		this.brand = br;
		this.serialNumber = sn;
		this.price = pr;
	}

	// Copy constructor
	public CellPhone(CellPhone c) {
		this.brand = c.brand;
		this.serialNumber = c.serialNumber;
		this.price = c.price;
	}

	// Builder method, once using , other public constructors should be private and remove setter
	private CellPhone(Builder builder) {
		this.brand = builder.brand;
		this.price = builder.price;
		this.serialNumber = builder.serialNumber;
	}

	public static class Builder {
		private String brand;
		private long serialNumber;
		private double price;

		public Builder(String brand) {
			this.brand = brand;
		}

		public Builder price(double price) {
			this.price = price;
			return this;
		}

		public Builder serialNumber(long sN) {
			this.serialNumber = sN;
			return this;
		}

		public CellPhone build() {
			return new CellPhone(this);
		}
	}

	// getter
	public String getBrand() {
		return brand;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	// setter
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone [brand=" + brand + ", serialNumber=" + serialNumber + ", price=" + price + "]";
	}

	@Override // only use price and brand
	public int hashCode() {
		return Objects.hash(brand, price);
	}

	@Override // only compare price and brand
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone cell = (CellPhone) obj;
		return Objects.equals(brand, cell.brand)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(cell.price);
	}
}
