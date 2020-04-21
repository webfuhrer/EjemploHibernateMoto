package ejemplo_1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//POJO

@Entity
public class Moto {
private String marca, modelo;
private int numero_cilindros;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

public Moto() {
	
}

public Moto(String marca, String modelo, int numero_cilindros, int id) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.numero_cilindros = numero_cilindros;
	this.id = id;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getNumero_cilindros() {
	return numero_cilindros;
}
public void setNumero_cilindros(int numero_cilindros) {
	this.numero_cilindros = numero_cilindros;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}
