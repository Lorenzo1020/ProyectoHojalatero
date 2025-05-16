package Implementacion;

import java.util.HashMap;

import Dominio.Llantas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	private HashMap<Long, Llantas> hasMapDatos = new HashMap<Long, Llantas>();

	@Override
	public void guardar(Llantas llanta) {
		// TODO Auto-generated method stub
		hasMapDatos.put(llanta.getCodigoBarra(), llanta);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hasMapDatos);
	}

	@Override
	public Llantas buscar(long codiBarra) {
		// TODO Auto-generated method stub
		return hasMapDatos.get(codiBarra);
	}

	@Override
	public void editar(Llantas llanta) {
		// TODO Auto-generated method stub
		hasMapDatos.put(llanta.getCodigoBarra(), llanta);
	}

	@Override
	public void eliminar(long codiBarra) {
		// TODO Auto-generated method stub
		hasMapDatos.remove(codiBarra);
	}

}
