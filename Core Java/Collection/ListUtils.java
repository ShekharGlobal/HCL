package com.hcl.coll;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

	public List<String> getCountryList(String c1, String c2, String c3, String c4, String c5) {
		List<String> countryList = new ArrayList<>();
		countryList.add(c1);
		countryList.add(c2);
		countryList.add(c3);
		countryList.add(c4);
		countryList.add(c5);
		return countryList;
	}

	public List<Integer> get1To10() {
		List<Integer> numList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}
		return numList;
	}

	public List<Integer> get1To15(List<Integer> numList) {
		List<Integer> numList2 = new ArrayList<>();
		numList2.addAll(numList);
		for (int i = 11; i <= 15; i++) {
			numList2.add(i);
		}
		return numList2;
	}

	public static void main(String[] args) {
		ListUtils utils = new ListUtils();

		// Example usage:
		List<String> countries = utils.getCountryList("USA", "Canada", "Mexico", "Brazil", "Argentina");
		System.out.println("Countries: " + countries);

		List<Integer> nums1To10 = utils.get1To10();
		System.out.println("Numbers 1 to 10: " + nums1To10);

		List<Integer> nums1To15 = utils.get1To15(nums1To10);
		System.out.println("Numbers 1 to 15: " + nums1To15);
	}
}
