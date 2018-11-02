package loops;

public class numberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;

		for (num1 = 1; num1 <= 6; num1++) {
			for (num2 = 2; num2 <= 6; num2++) {
				for (num3 = 3; num3 <= 6; num3++) {
					for (num4 = 4; num4 <= 6; num4++) {
						for (num5 = 5; num5 <= 6; num5++) {
							if (num5 == 6) {
								System.out.print("5");
							} else {
								System.out.print(num5 + "	");
							}
						}
						System.out.println();
						if (num4 == 6) {
							System.out.print("4");
						} else {
							System.out.print(num4 + "	");
						}
					}
					System.out.println();
					if (num3 == 6) {
						System.out.print("3");
					} else {
						System.out.print(num3 + "	");
					}
				}
				System.out.println();
				if (num2 == 6) {
					System.out.print("2");
				} else {
					System.out.print(num2 + "	");
				}
			}
			System.out.println();
			if (num1 == 6) {
				System.out.print("1");
			} else {
				System.out.print(num1 + "	");
			}
		}

	}

}
