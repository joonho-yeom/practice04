package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute ( String function ) {
		
		if ( function.equals("앱") ) {
			playApp();
			return;
		}
		
		super.execute( function );
	}
	
	public void playApp(){
		System.out.println("앱을 동작합니다.");
	}
	
	
}
