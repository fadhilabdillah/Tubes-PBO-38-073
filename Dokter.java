public class Dokter extends Orang{
	private String spesialis;

	public Dokter(String id, String nama, String spesialis, String alamat){
		super.setId(id);
		super.setNama(nama);
		setSpesialis(spesialis);
	}


	public void setSpesialis(String spesialis){
		this.spesialis = spesialis;
	}

	public String getSpesialis(){
		return spesialis;
	}

}