public abstract class Orang{
	private String id;
	private String nama;
	private String alamat;

	public Orang(String id, String nama, String alamat){
		setId(id);
		setNama(nama);
		setAlamat(alamat);
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}
}