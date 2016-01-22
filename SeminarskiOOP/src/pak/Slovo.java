package pak;

public final class Slovo {
	
	String c;

	public Slovo(String c) {
		super();
		this.c = c;
	}

	public Slovo() {
		
	}

	@Override
	public String toString() {
		return ""+c ;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	
	

}
