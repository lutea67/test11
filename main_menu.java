import java.util.Scanner;

public class main_menu {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int selectedMenu = 0;
		
		while(selectedMenu != 4) {
			
			System.out.println("==============================");
			System.out.println("1. Contacts");
			System.out.println("2. To-do lists");
			System.out.println("3. Appointments");
			System.out.println("4. ����");
			System.out.println("==============================");
			System.out.print("���ϴ� �޴��� �Է��ϼ���: ");
			
			try { 
				selectedMenu = userInput.nextInt();
				System.out.println();
			} catch (Exception e) {
				System.out.println();
				System.out.println("���ڷ�  �ٽ� �Է����ּ���.");
				System.out.print("���ϴ� �޴��� �Է��ϼ���: ");
				userInput = new Scanner(System.in);
				selectedMenu = userInput.nextInt();
			}
			
			if(selectedMenu < 1 || selectedMenu > 4) {
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println();
			}
			
			if(selectedMenu == 1) {
				
			}
			
			if(selectedMenu == 2) {
				
			} 
			
			if(selectedMenu == 3){
				
				ListAppointment AppointmentMenu = new ListAppointment();
				AppointmentMenu.listAppointment();
				
			}
			
		}
		
		userInput.close();
	}

}
