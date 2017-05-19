package application;

import javafx.beans.property.SimpleStringProperty;

public class Penduduk {
	private final SimpleStringProperty nik, nama, tempatTglLahir, jenisKelamin, alamat, rtRw, kelDesa, kecamatan, 
	agama, stKawin, pekerjaan, wargaNegara, berlakuHingga;

	public Penduduk(String nik, String nm, String TTL, String jk, String almt, String rtRw, 
						String kelDesa, String kec, String agama, String stKwn, String pkjn,
							String wrgNgr, String blkHingga) {
		this.nik = new SimpleStringProperty(nik);
		this.nama = new SimpleStringProperty(nm);
		this.tempatTglLahir = new SimpleStringProperty(TTL);
		this.jenisKelamin = new SimpleStringProperty(jk);
		this.alamat = new SimpleStringProperty(almt);
		this.rtRw = new SimpleStringProperty(rtRw);
		this.kelDesa = new SimpleStringProperty(kelDesa);
		this.kecamatan = new SimpleStringProperty(kec);
		this.agama = new SimpleStringProperty(agama);
		this.stKawin = new SimpleStringProperty(stKwn);
		this.pekerjaan = new SimpleStringProperty(pkjn);
		this.wargaNegara = new SimpleStringProperty(wrgNgr);
		this.berlakuHingga = new SimpleStringProperty(blkHingga);
		}

	public String getNik() {
	return nik.get();
	}
	
	public void setNik(String NIK) {
	nik.set(NIK);
	}
	
	public String getNama() {
	return nama.get();
	}
	
	public void setNama(String nm) {
	nama.set(nm);
	}
	public String getTempatTglLahir() {
	return tempatTglLahir.get();
	}
	
	public void setTempatTglLahir(String TTL) {
	tempatTglLahir.set(TTL);
	}
	
	public String getJenisKelamin() {
	return jenisKelamin.get();
	}
	
	public void setJenisKelamin(String jk) {
	jenisKelamin.set(jk);
	}
	
	public String getAlamat() {
	return alamat.get();
	}
	
	public void setAlamat(String almt) {
	alamat.set(almt);
	}
	
	public String getRtRw() {
	return rtRw.get();
	}
	
	public void setRtRw(String RTRW) {
	rtRw.set(RTRW);
	}
	
	public String getKelDesa() {
	return kelDesa.get();
	}
	
	public void setKelDesa(String kelDs) {
	kelDesa.set(kelDs);
	}
	
	public String getKecamatan() {
	return kecamatan.get();
	}
	
	public void setKecamatan(String kec) {
	kecamatan.set(kec);
	}
	public String getAgama() {
	return agama.get();
	}
	
	public void setAgama(String agm) {
	agama.set(agm);
	}
	
	public String getStKawin() {
	return stKawin.get();
	}
	public void setStKawin(String stKwn) {
	stKawin.set(stKwn);
	}
	public String getPekerjaan() {
	return pekerjaan.get();
	}
	
	public void setPekerjaan(String pkjn) {
	pekerjaan.set(pkjn);
	}
	public String getWargaNegara() {
	return wargaNegara.get();
	}
	
	public void setWargaNegara(String wrgngr) {
	wargaNegara.set(wrgngr);
	}
	public String getBerlakuHingga() {
	return berlakuHingga.get();
	}
	
	public void setBerlakuHingga(String blkHingga) {
	berlakuHingga.set(blkHingga);
	}

}

