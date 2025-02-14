package td4.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import nouvelles.Description;
import nouvelles.Service;
import nouvelles.Trip;
import td4.core.PayingItem;

public class Service4PI<T extends PayingItem> implements Service {
	protected List<T> payingItemList = new ArrayList<>();

	public Service4PI(List<T> payingItemList) {
		this.payingItemList = payingItemList;
	}

	protected List<T> getpayingItemList() {
		return payingItemList;
	}

	public List<T> sortedByPrice() {
		payingItemList.sort(Comparator.comparing(PayingItem::getPrice));
		return new ArrayList<T>(payingItemList);
	}

	private void sortedByPriceInPlace() {
		payingItemList.sort(Comparator.comparing(PayingItem::getPrice));
	}
	public T lessExpensiveItem() {
		sortedByPriceInPlace();
		return payingItemList.get(0);
	}

	public void add(T payingItem) {
		payingItemList.add(payingItem);
	}

	@Override
	public PayingItem find(Description d) {
		PayingItem tmp = new Trip(d);
		for(int i = 0 ; i < payingItemList.size(); i++) {
				if( payingItemList.get(i) == tmp ) {
					return payingItemList.get(i);
			}
		}
		return null;
	}

}