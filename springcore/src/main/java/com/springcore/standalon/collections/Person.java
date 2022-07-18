package com.springcore.standalon.collections;

import java.util.Map;
import java.util.Properties;
import java.util.List;

public class Person {

	private List<String> names;
	private Map<String, Integer> feeStructures;
	private Properties prop;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Map<String, Integer> getFeeStructures() {
		return feeStructures;
	}

	public void setFeeStructures(Map<String, Integer> feeStructures) {
		this.feeStructures = feeStructures;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Person [names=" + names + ", feeStructures=" + feeStructures + ", prop=" + prop + "]";
	}

}
