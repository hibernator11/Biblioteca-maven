package tion.ua.es;

import org.json.JSONObject;

public class Libro extends Publicacion{
	
	private String isbn;
	private String lugarPublicacion;
	
	public Libro(String titulo, String autor, String isbn, String lugarPublicacion) {
		super(titulo, autor);
		this.isbn = isbn;
		this.lugarPublicacion = lugarPublicacion;
	}

	public String getLugarPublicacion() {
		return lugarPublicacion;
	}

	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public JSONObject getJSON() {
		JSONObject json = new JSONObject();
		json.put("isbn", this.isbn);
		json.put("lugarPublicacion", this.lugarPublicacion);
		json.put("titulo", this.titulo);
		json.put("autor", this.autor);
		return json;
	}
}
