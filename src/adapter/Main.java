package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Ane", 29);
		p.addSymptom(new Symptom("s1", 10, 8), 1);
		p.addSymptom(new Symptom("s2", 10, 26), 2);
		p.addSymptom(new Symptom("s3", 10, 44), 3);
		p.addSymptom(new Symptom("s4", 10, 3), 4);
		p.addSymptom(new Symptom("s5", 10, 2538), 5);
		
		InvertedIterator i = new Covid19PacientIteratorAdapter(new ArrayList<Symptom>(p.getSymptoms()));
		Comparator<Object> c1 = new SeverityIndexComparator();
		Comparator<Object> c2 = new SymptomNameComparator();
		Iterator<Object> iSeverity = Sorting.sortedIterator(i, c1);
		Iterator<Object> iName = Sorting.sortedIterator(i, c2);
		
		System.out.println("Sintomak severityIndex orenatuz:");
		while(iSeverity.hasNext()) {
			System.out.println (iSeverity.next());
		}
		
		System.out.println("Sintomak symptomNama ordenatuz:");
		while(iName.hasNext()) {
			System.out.println(iName.next());
		}

	}

}
