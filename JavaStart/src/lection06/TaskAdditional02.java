package lection06;

/*Число-палиндром с обеих сторон (справа налево и слева направо) 
 * читается одинаково. Самое большое число-палиндром, полученное 
 * умножением двух двузначных чисел 9009 = 91 * 99. Найдите самый 
 * большой палиндром, полученный умножением двух трехзначных чисел (4 часа)*/

public class TaskAdditional02 {

	public static void main(String[] args) {

		int[] res = findPalindrom();
		
		System.out.format("Max palindrom is %s = %s * %s", res[0], res[1], res[2]);

	}
	
	public static int[] findPalindrom() {
		int [] array = new int[3];
		int maxPalindrom = 0;
		int maxA = 0;
		int maxB = 0;
		int currentCandidate;
		for (int i = 999; i > 99; i-- ) {
			for (int j = 999; j > 99; j--) {
				currentCandidate = i * j;
				if (isPalindrom(currentCandidate)) {
					if (currentCandidate > maxPalindrom) {
						maxPalindrom = currentCandidate;
						maxA = i;
						maxB = j;
					}
				}
			}
		}
		array[0] = maxA * maxB;
		array[1] = maxB;
		array[2] = maxA;
		
		return array;
	}

	public static boolean isPalindrom (int candidate) {
		int digitL;
		int digitR;
		boolean isPalindrom = false;

		digitL = candidate / 100000;
		digitR = candidate % 10;

		if (digitL == digitR) {
			digitL = (candidate / 10000) % 10;
			digitR = (candidate / 10) % 10;
		}
		if (digitL == digitR) {
			digitL = (candidate / 1000) % 10;
			digitR = (candidate / 100) % 10;			
		}
		if (digitL == digitR) {
			isPalindrom = true;
		}

		return isPalindrom;
	}
	
}
