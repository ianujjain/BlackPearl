package BlackPearl.Controller.Implementation;

import BlackPearl.Controller.Enum.SortType;
import BlackPearl.Controller.Enum.FieldType;
import BlackPearl.Controller.Interfaces.ISort;

public class Sort {

	public ISort IsSort(SortType sortType, FieldType fieldType) {
		switch (fieldType) {
		case NUMERIC:
			switch (sortType) {
			case ASCENDING:
				return new SortAsc();
			case DESCENDING:
				return new SortDesc();
			default:
				return null;
			}
		case TEXT:
			switch (sortType) {
			case ASCENDING:
				return new SortAsc();
			case DESCENDING:
				return new SortDesc();
			default:
				return null;
			}
		default:
			return null;
		}
	}
}