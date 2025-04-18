package clase;

public class Empleado {
	private String cod, nom, area;
	private double sue;
	private int he, afilia;
	
	public Empleado(String cod, String nom, String area, double sue, int he, int afilia) {
		this.cod = cod;
		this.nom = nom;
		this.area = area;
		this.sue = sue;
		this.he = he;
		this.afilia = afilia;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getSue() {
		return sue;
	}

	public void setSue(double sue) {
		this.sue = sue;
	}

	public int getHe() {
		return he;
	}

	public void setHe(int he) {
		this.he = he;
	}

	public int getAfilia() {
		return afilia;
	}

	public void setAfilia(int afilia) {
		this.afilia = afilia;
	}
	
	public double MontoHE() {
		return sue * he / 240;
	}
	
	public double SueldoBruto() {
		return sue + MontoHE();
	}
	
	public double dsctoAFP() {
		return 0.11 * SueldoBruto();
	}
	
	public double dsctoSNP() {
		return 0.06 * SueldoBruto();
	}
	
	public double dsctoSalud() {
		return 0.03 * SueldoBruto();
	}
	
	public double SueldoNeto() {
		
		double sueFinal = SueldoBruto() - dsctoSalud();
		
		if(afilia == 0)
			sueFinal = SueldoBruto() - dsctoAFP();
		else
			sueFinal = SueldoBruto() - dsctoAFP();
		
		return sueFinal;
	}
	
}
