package pak;

public abstract class Rec {
	
	protected String fraza,pomoc;
	private static int brojzivota=6;
	

	
	

	public Rec(String fraza, String pomoc) {
		super();
		this.fraza = fraza;
		this.pomoc = pomoc;
		
	}

	public String getFraza() {
		return fraza;
	}

	public void setFraza(String fraza) {
		this.fraza = fraza;
	}

	public void setPomoc(String pomoc) {
		this.pomoc = pomoc;
	}

	public String getPomoc() {
		return pomoc;
	}
	
	public int brojzivota(){
		return brojzivota;
	}
	
	

}
