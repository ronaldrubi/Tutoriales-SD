package service.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Grupo {
	private String id;
	private String sigla;
	private String descripcion;
	private String numero;
	private String horario;
	private String aula;
	
	public Grupo() {}	
	public Grupo(String id, String sigla, String descripcion, String numero,
	             String horario, String aula) {
		this.id = id;
		this.sigla = sigla;
		this.descripcion = descripcion;
		this.numero = numero;
		this.horario = horario;
		this.aula = aula;
	}
	public void setId(String id) {this.id=id;}
	public String getId() {return id;}
	public void setSigla(String sigla) {this.sigla=sigla;}
	public String getSigla() {return sigla;}
	public void setDescripcion(String descripcion) {this.descripcion=descripcion;}
	public String getDescripcion() {return descripcion;}
	public void setNumero(String numero) {this.numero=numero;}
	public String getNumero() {return numero;}
	public void setHorario(String horario) {this.horario=horario;}
	public String getHorario() {return horario;}
	public void setAula(String aula) {this.aula=aula;}
	public String getAula() {return aula;}
}