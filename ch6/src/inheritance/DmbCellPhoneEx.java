package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.model = "자바폰";
		dmbCellPhone.color = "white";
		dmbCellPhone.chanel = 7;
		
		dmbCellPhone.powerOn();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChanelDmb(8);
		dmbCellPhone.powerOff();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요");
		dmbCellPhone.handUp();
	}

}
