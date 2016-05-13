package negocio;

import java.util.ArrayList;
import java.util.List;

public class Valores implements ValoresITF {
	

	List<Integer> valores = new ArrayList<Integer>();

	public List<Integer> getValores() {
		return valores;
	}

	public void setValores(List<Integer> valores) {
		this.valores = valores;
	}
	
	
	@Override
	public boolean ins(int v) {
		if(v > 0) {
			getValores().add(v);
			return true;
		}
		
		return false;
	}

	@Override
	public int del(int i) {
		if(size() > 0) {
			getValores().remove(i);
			return i;
		}
		return -1;
	}

	@Override
	public int size() {
		
		return getValores().size();
	}

	@Override
	public double mean() {
		if(size() == 0) {
			return 0.0;			
		}
		double media = 0.0;
		for (Integer integer : getValores()) {
			media += integer.doubleValue();
		}
		return media / size();
	}

	@Override
	public int greater() {
		if(size() == 0) {
			return -1;
		}
		int maiorValor = 0;
		for (Integer integer : getValores()) {
			if(integer > maiorValor) 
				maiorValor = integer;
		}
		return maiorValor;
	}

	@Override
	public int lower() {
		if(size() == 0) {
			return -1;
		}	
		int menorValor = getValores().get(0);
		for (Integer integer : getValores()) {
			if(integer < menorValor) 
				menorValor = integer;
		}
		return menorValor;
	}
	
}
