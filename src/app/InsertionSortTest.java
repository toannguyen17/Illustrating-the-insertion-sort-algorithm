package app;

public class InsertionSortTest {
	public static void InsertionSortDESC(int[] list){
		for(int i = 0; i < list.length; i++){
			int currentMap      = list[i];
			int currentMapIndex = i;
			for(int j = list.length-1; j >= 0; j--){
				if (list[j] < currentMap){
					list[currentMapIndex] = list[j];
					list[j] = currentMap;
					currentMapIndex = j;
				}
			}
		}
	}

	public static void InsertionSortASC(int[] list){
		for(int i = 0; i < list.length; i++){
			int currentMap      = list[i];
			int currentMapIndex = i;
			for(int j = i-1; j >= 0; j--){
				if (list[j] > currentMap){
					//System.out.println("\n" + list[j] + " " + currentMap);
					System.out.println("\n");
					list[currentMapIndex] = list[j];
					list[j] = currentMap;
					currentMapIndex = j;

					for(int item: list){
						if (item == currentMap)
							System.out.print("[" + item + "] ");
						else
							System.out.print(item + " ");
					}

				}
			}
		}
	}

	public static void main(String[] args) {
		int[] list = {99,98,78,4,5,8,3,2,94,45,81,100,9,71};

		System.out.println("List");

		InsertionSortASC(list);

	}
}
