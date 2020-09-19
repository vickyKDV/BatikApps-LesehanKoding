package com.lesehankoding.batikapps.Model;

import com.google.gson.annotations.SerializedName;

public class HasilItem{

	@SerializedName("daerah_batik")
	private String daerahBatik;

	@SerializedName("harga_rendah")
	private int hargaRendah;

	@SerializedName("harga_tinggi")
	private int hargaTinggi;

	@SerializedName("nama_batik")
	private String namaBatik;

	@SerializedName("makna_batik")
	private String maknaBatik;

	@SerializedName("link_batik")
	private String linkBatik;

	@SerializedName("id")
	private int id;

	@SerializedName("hitung_view")
	private int hitungView;

	public void setDaerahBatik(String daerahBatik){
		this.daerahBatik = daerahBatik;
	}

	public String getDaerahBatik(){
		return daerahBatik;
	}

	public void setHargaRendah(int hargaRendah){
		this.hargaRendah = hargaRendah;
	}

	public int getHargaRendah(){
		return hargaRendah;
	}

	public void setHargaTinggi(int hargaTinggi){
		this.hargaTinggi = hargaTinggi;
	}

	public int getHargaTinggi(){
		return hargaTinggi;
	}

	public void setNamaBatik(String namaBatik){
		this.namaBatik = namaBatik;
	}

	public String getNamaBatik(){
		return namaBatik;
	}

	public void setMaknaBatik(String maknaBatik){
		this.maknaBatik = maknaBatik;
	}

	public String getMaknaBatik(){
		return maknaBatik;
	}

	public void setLinkBatik(String linkBatik){
		this.linkBatik = linkBatik;
	}

	public String getLinkBatik(){
		return linkBatik;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setHitungView(int hitungView){
		this.hitungView = hitungView;
	}

	public int getHitungView(){
		return hitungView;
	}
}