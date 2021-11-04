package adapter;

import java.util.List;

import domain.Symptom;

public class Covid19PacientIteratorAdapter implements InvertedIterator {

	private List<Symptom> symptoms;
	int pos = 0;
	
	public Covid19PacientIteratorAdapter(List<Symptom> s) {
		this.symptoms = s;
	}
	
	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(pos);
		pos--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return pos >= 0; 
	}

	@Override
	public void goLast() {
		pos = symptoms.size()-1;

	}
}
