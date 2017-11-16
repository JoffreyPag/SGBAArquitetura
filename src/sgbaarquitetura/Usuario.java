package sgbaarquitetura;

/**
 *
 * @author joffr
 */
public abstract class Usuario extends Pessoa {

    protected String email, senha, telefone, matricula;
    protected char tipoUser;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public char getTipoUser() {
        return tipoUser;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipoUser(char tipoUser) {
        this.tipoUser = tipoUser;
    }
    
}
