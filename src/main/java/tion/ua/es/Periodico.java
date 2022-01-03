package tion.ua.es;

import java.util.Date;

import org.json.JSONObject;

public class Periodico extends Publicacion{
	
	private Date fecha;
	
	public Periodico(Date fecha) {
		super();
		this.fecha = fecha;
	}
	
	public Periodico(String titulo, String autor, Date fecha) {
		super(titulo,autor);
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public JSONObject getJSON() {
		JSONObject json = new JSONObject();
		json.put("fecha", this.fecha);
		json.put("titulo", this.titulo);
		json.put("autor", this.autor);
		return json;
	}
}
