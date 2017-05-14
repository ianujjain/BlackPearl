package BlackPearl.Controller.Implementation;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;

import BlackPearl.Controller.Interfaces.ISort;

public class SortDesc implements ISort {

	ArrayList<String> obtainedList1;
	ArrayList<String> obtainedList2;

	@Override
	public Boolean IsSort(WebDriver webDriver, String ObjectAlias) {
		Boolean isSort = false;

		obtainedList1 = new ArrayList<>();

		obtainedList1.add("B");
		obtainedList1.add("A");

		obtainedList2 = new ArrayList<>(obtainedList1);

		Collections.copy(obtainedList2, obtainedList1);
		Collections.sort(obtainedList1);

		for (int i = 0; i < obtainedList1.size(); i++) {
			if (!(obtainedList1.get(i).equals(obtainedList2.get(i)))) {
				System.out.println("Customer Names not sorted: " + obtainedList1.get(i));
				break;
			} else {
				System.out.println("Hello");
			}
		}
		return isSort;
	}

}
