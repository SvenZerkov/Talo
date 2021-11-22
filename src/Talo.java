
public class Talo {
	private String tyyli;
	private int rakennusVuosi;
	private double pintaAla;
	private int kerrosLkm;
	private String osoite;
	private int huoneLkm;
	
	private boolean onkoAsuttu;
	private boolean onkoLammin;
	private boolean tarvitseekoRemonttia;
	
	public Talo() {
		
	}
	
	public Talo(String tyyli, int rakennusvuosi, double pintaAla, int kerrosLkm, String osoite, int huoneLkm) {
		this.tyyli = tyyli;
		this.rakennusVuosi = rakennusvuosi;
		this.pintaAla = pintaAla;
		this.kerrosLkm = kerrosLkm;
		this.osoite = osoite;
		this.huoneLkm = huoneLkm;
		this.onkoAsuttu = true;
		this.onkoLammin = true;
		this.tarvitseekoRemonttia = false;
	}
	
	public boolean onkoAsuttu() {
		return this.onkoAsuttu;
	}
	
	public boolean onkoLammin() {
		return this.onkoLammin;
	}
	
	public boolean tarvitseekoRemonttia() {
		return this.tarvitseekoRemonttia;
	}
	
	public void setRemontti(String vaite) {
		if (vaite.equals("Kyllä")) {
			this.tarvitseekoRemonttia = true;
		} else {
			this.tarvitseekoRemonttia = false;
		}
	}
	
	

	@Override
	public String toString() {
		return "Talo [tyyli=" + tyyli + ", rakennusVuosi=" + rakennusVuosi + ", pintaAla=" + pintaAla + ", kerrosLkm="
				+ kerrosLkm + ", osoite=" + osoite + ", huoneLkm=" + huoneLkm + "]";
	}

	public String getTyyli() {
		return tyyli;
	}

	public void setTyyli(String tyyli) {
		this.tyyli = tyyli;
	}

	public int getRakennusVuosi() {
		return rakennusVuosi;
	}

	public void setRakennusVuosi(int rakennusVuosi) {
		this.rakennusVuosi = rakennusVuosi;
	}

	public double getPintaAla() {
		return pintaAla;
	}

	public void setPintaAla(double pintaAla) {
		this.pintaAla = pintaAla;
	}

	public int getKerrosLkm() {
		return kerrosLkm;
	}

	public void setKerrosLkm(int kerrosLkm) {
		this.kerrosLkm = kerrosLkm;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public int getHuoneLkm() {
		return huoneLkm;
	}

	public void setHuoneLkm(int huoneLkm) {
		this.huoneLkm = huoneLkm;
	}
	
	public void uusiMetodi() {
		System.out.println("lisäys");
	}
	
	
	
}
