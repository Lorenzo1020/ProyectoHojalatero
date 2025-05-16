package Main;

import java.util.Scanner;

import Dominio.Llantas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {

		Scanner lectura = null;

		// Ejercicio
		// ProyectoVeterinaria
		// Paquetes
		// Clase: Mascotas
		// Atributos: clave, nombre, raza, precio
		// Interface(crud basico hashMap)
		// Implementacion
		// Principal(Scanner, excepcion de errores, validaciones)

		long codigoBarra;
		String marca;
		String medidas;
		float precio;
		int existencia, menuPrinc;

		Llantas llanta;

		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingrese el codigo de barra");
					lectura = new Scanner(System.in);
					codigoBarra = lectura.nextLong();

					System.out.println("Ingresa la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingresa las medidas");
					lectura = new Scanner(System.in);
					medidas = lectura.nextLine();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingresa la existencia");
					lectura = new Scanner(System.in);
					existencia = lectura.nextInt();

					// Crear el objeto
					llanta = new Llantas(codigoBarra, marca, medidas, precio, existencia);

					// Agregar al hashMap
					imp.guardar(llanta);
					System.out.println("Se agrego");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				imp.mostrar();
				break;
			case 3:
				try {
					System.out.println("Ingrese el codigo de barra para buscar");
					lectura = new Scanner(System.in);
					codigoBarra = lectura.nextLong();

					// Buscar
					llanta = imp.buscar(codigoBarra);

					if (llanta != null)
						System.out.println("Se encontro " + llanta);
					else
						System.out.println("No existe ese registro");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar");
				}
				break;
			case 4:
				try {
					System.out.println("Ingrese el codigo de barra para editar");
					lectura = new Scanner(System.in);
					codigoBarra = lectura.nextLong();

					// Buscar
					llanta = imp.buscar(codigoBarra);

					if (llanta != null) {
						System.out.println("Se encontro " + llanta);

						// Actualizacion
						System.out.println("Ingrese la nueva marca");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();

						// Actualizar el objeto
						llanta.setMarca(marca);

						// Actualizar en el hahMap
						imp.editar(llanta);
						System.out.println("Se edito con exito");

					} else
						System.out.println("No existe ese registro");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al editar");
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el codigo de barra a eliminar");
					lectura = new Scanner(System.in);
					codigoBarra = lectura.nextLong();

					// Eliminacion
					imp.eliminar(codigoBarra);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}

				break;
			case 6:
				break;
			}

		} while (menuPrinc < 6);

	}
}
