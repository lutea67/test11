import java.util.Date;
import java.util.Scanner;

public class ListAppointment {
	
	Scanner userInput = new Scanner(System.in);
	AppointmentDAO dbAction = new AppointmentDAO();
	Date date;
	
	private int selectedAppointmentMenu = 0;

	public void listAppointment() {
		
		dbAction.SelectAppointment("listAll", date,"");
		System.out.println();
		
		while(selectedAppointmentMenu != 4) {
			
			System.out.println("--------��� ����--------");
			System.out.println("1. ��� ���");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ���� �޴��� ���ư���");
			System.out.print("���ϴ� �޴��� �Է��ϼ��� : ");
			
			try { 
				selectedAppointmentMenu = userInput.nextInt();
				System.out.println();
			} catch (Exception e) {
				System.out.println();
				System.out.println("���ڷ�  �ٽ� �Է����ּ���.");
				System.out.print("���ϴ� �޴��� �Է��ϼ���: ");
				userInput = new Scanner(System.in);
				selectedAppointmentMenu = userInput.nextInt();
			}
			
			checkAppointmentMenu();
			
		}
		
	}
	
	private void checkAppointmentMenu() {
		
		if(selectedAppointmentMenu < 1 || selectedAppointmentMenu > 4) {
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.println();
		}
		
		if(selectedAppointmentMenu == 1) {
			dbAction.CreateAppointment();
			System.out.println();
		}
		
		if(selectedAppointmentMenu == 2) {
			dbAction.ModifyAppointment(0); //int aid �ʿ�
			System.out.println();
		} 
		
		if(selectedAppointmentMenu == 3){
			dbAction.DeleteAppointment(0); //int aid �ʿ�
			System.out.println();
		}
		
	}
	
}
