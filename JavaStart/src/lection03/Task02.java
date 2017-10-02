package lection03;

import java.util.Scanner;

/*���� ������������� ���, � ������� 4 ��������.
����� �������� ���������� � �������. �� ����� ����� 4 ��������.
�������� ��������� ������� ������� ����� �������� � ����������,
� ������� �� ����� �� ����� �����, ������ �������� ������������ 
��� ��������. ���� �����  �������� ��� � ���� ���� �� ����� 
�������� �� ���� ������������*/

public class Task02 {

	public static void main(String[] args) {
		int entrancesPerHouse = 4;
		int floors = 9;
		int flatsPerFloor = 4;		
		
		System.out.print("Please enter flat#: ");
		
		Scanner scanner = new Scanner(System.in);
		int flatNumber = scanner.nextInt();
		
		if (flatNumber > 0 ) {
			int capacity = flatsPerFloor * floors * entrancesPerHouse;
			if (flatNumber <= capacity) {
				float getInfo = (float) flatNumber / capacity * entrancesPerHouse;		
				int subResult = (int)Math.ceil(getInfo);		
				int startFlat = flatsPerFloor * floors * (subResult - 1);	
				startFlat = startFlat == 0 ? 1 : startFlat;
				int floorResult = (int)Math.ceil((float)(flatNumber - startFlat + 1 ) / flatsPerFloor);
				if (flatNumber == capacity) {
					floorResult = floors;
				}
				System.out.format("Flat #%d is located: entrance #%d, floor# %d", flatNumber, subResult, floorResult);
			} else {
				System.out.format("Attention! Flat #%d can't be located in %d-entrances %d-floor building", flatNumber, entrancesPerHouse, floors);
			}
		} else {
			System.out.format("Attention! Floor number less then 1 is not possible to find");
		}

	}

}
