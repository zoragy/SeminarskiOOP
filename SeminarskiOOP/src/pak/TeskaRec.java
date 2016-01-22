package pak;

public final class TeskaRec extends Rec {
	
	
	
	
	public TeskaRec(String fraza, String pomoc) {
		super(fraza, pomoc);
		
	}



	@Override
	public int brojzivota() {
		
		return super.brojzivota()-2;
	}


	
	

}
