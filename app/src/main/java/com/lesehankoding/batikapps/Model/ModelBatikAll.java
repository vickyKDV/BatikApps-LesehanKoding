package com.lesehankoding.batikapps.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ModelBatikAll{

	@SerializedName("max_price")
	private int maxPrice;

	@SerializedName("min_price")
	private int minPrice;

	@SerializedName("total_halaman")
	private int totalHalaman;

	@SerializedName("hasil")
	private List<HasilItem> hasil;

	@SerializedName("total_element")
	private int totalElement;

	public void setMaxPrice(int maxPrice){
		this.maxPrice = maxPrice;
	}

	public int getMaxPrice(){
		return maxPrice;
	}

	public void setMinPrice(int minPrice){
		this.minPrice = minPrice;
	}

	public int getMinPrice(){
		return minPrice;
	}

	public void setTotalHalaman(int totalHalaman){
		this.totalHalaman = totalHalaman;
	}

	public int getTotalHalaman(){
		return totalHalaman;
	}

	public void setHasil(List<HasilItem> hasil){
		this.hasil = hasil;
	}

	public List<HasilItem> getHasil(){
		return hasil;
	}

	public void setTotalElement(int totalElement){
		this.totalElement = totalElement;
	}

	public int getTotalElement(){
		return totalElement;
	}
}