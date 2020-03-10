package ifba.exemplo.model;

import java.sql.Date;
import java.sql.Column;
import java.sql.Entity;
import java.sql.Table;
import java.sql.Id;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@Column(name="id_usuario")
	private int id_usuario;
	
	@Column(name="nm_usuario")
	private String nm_usuario;
	
	@Column(name="dt_cadastro")
	private Date dt_cadastro;
	
	@Column(name="sx_usuario")
	private String sx_usuario;
	
	@Column(name="email_usuario")
	private String email_usuario;
	
	@Column(name="senha_usuario")
	private String senha_usuario;
	
	@Column(name="cpf_usuario")
	private String cpf_usuario;
	
	@Column(name="sobrenome_usuario")
	private String sobrenome_usuario;
	
	@Column(name="instituicao_usuario")
	private String instituicao_usuario;
	
	@Column(name="funcao_usuario")
	private String funcao_usuario;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public Date getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public String getSx_usuario() {
		return sx_usuario;
	}

	public void setSx_usuario(String sx_usuario) {
		this.sx_usuario = sx_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	public String getCpf_usuario() {
		return cpf_usuario;
	}

	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}

	public String getSobrenome_usuario() {
		return sobrenome_usuario;
	}

	public void setSobrenome_usuario(String sobrenome_usuario) {
		this.sobrenome_usuario = sobrenome_usuario;
	}

	public String getInstituicao_usuario() {
		return instituicao_usuario;
	}

	public void setInstituicao_usuario(String instituicao_usuario) {
		this.instituicao_usuario = instituicao_usuario;
	}

	public String getFuncao_usuario() {
		return funcao_usuario;
	}

	public void setFuncao_usuario(String funcao_usuario) {
		this.funcao_usuario = funcao_usuario;
	}

	public Usuario(int id_usuario, String nm_usuario, Date dt_cadastro, String sx_usuario, String email_usuario,
			String senha_usuario, String cpf_usuario, String sobrenome_usuario, String instituicao_usuario,
			String funcao_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nm_usuario = nm_usuario;
		this.dt_cadastro = dt_cadastro;
		this.sx_usuario = sx_usuario;
		this.email_usuario = email_usuario;
		this.senha_usuario = senha_usuario;
		this.cpf_usuario = cpf_usuario;
		this.sobrenome_usuario = sobrenome_usuario;
		this.instituicao_usuario = instituicao_usuario;
		this.funcao_usuario = funcao_usuario;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
