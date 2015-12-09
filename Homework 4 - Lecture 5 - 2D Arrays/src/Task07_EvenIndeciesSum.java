
//������ 7:
//����� ������������� �������� ��������� �� ���������� �����,
//�������� � ��������� ������� � ������� 6 ���� � 6 ������.
//�� �� ������� �������� , ���� ����� �� ������ ������ �� ������
//��������, ����� ���� �� ������� �� ��� � ������ � ����� �����.
//���������� �� ������� ����������� ���� �� ����� ������� ��� ��
//����������� �������, ����� � ������ ���� �� ���� ��������.
//�� �� �������� ���� ���� �����.
//������:
//11,12,13,14,15,16,
//21,22,23,24,25,26,
//31,32,33,34,35,36,
//41,42,43,44,45,46,
//51,52,53,54,55,56,
//61,62,63,64,65,66
//�����:
//11, ,13, ,15, , ���� �� ���������� �� ����: 39
//22, ,24, ,26, ���� �� ���������� �� ����: 72
//31, ,33, ,35, , ���� �� ���������� �� ����: 99
//42, ,44, ,46, ���� �� ���������� �� ����: 132
//51, ,53, ,55, , ���� �� ���������� �� ����: 159
//62, ,64, ,66 ���� �� ���������� �� ����: 192
//���� �� ����������: 693

public class Task07_EvenIndeciesSum {

	public static void main(String[] args) {
		int size = 6;
		int[][] matrix = { 
				{ 11, 12, 13, 14, 15, 16 },
				{ 21, 22, 23, 24, 25, 26 }, 
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, 
				{ 51, 52, 53, 54, 55, 56 },
				{ 61, 62, 63, 64, 65, 66 } 
			};
		int[] rowsSums = new int[size];
		int sum = 0;
		
		for (int row = 0; row < size; row++) {
			if (row % 2 == 0) {
				rowsSums[row] = matrix[row][0] + matrix[row][2] + matrix[row][4];
				System.out.println( matrix[row][0] + ", " + 
						matrix[row][2] + ", " + matrix[row][4] + 
						" ���� �� ���������� �� ����: " + rowsSums[row]);
			}
			else {
				rowsSums[row] = matrix[row][1] + matrix[row][3] + matrix[row][5];
				System.out.println( matrix[row][1] + ", " + 
						matrix[row][3] + ", " + matrix[row][5] + 
						" ���� �� ���������� �� ����: " + rowsSums[row]);
			}
			
			sum += rowsSums[row];
		}
		
		System.out.println("���� �� ����������: " + sum);

	}

}