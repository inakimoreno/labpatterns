package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomNameComparator implements Comparator<Object>{
	
	public SymptomNameComparator() {
		super();
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Symptom s1 = (Symptom)o1;
		Symptom s2 = (Symptom)o2;
		return s1.getName().compareTo(s2.getName()); 
	}
	
	@Override
	public boolean equals(Object o) {
		return this.equals(o);
	}
}