
package br.com.fatecpg.projeto05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Fabricante {
    private int id;
    private String nome;
    private String email;
    private String cidade;
    private String estado;
    
    public static ArrayList<Fabricante> getList() throws Exception {
        ArrayList<Fabricante> list = new ArrayList<>();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url,"app","app");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM MANUFACTURER");
        while (rs.next()){
            Fabricante m = new Fabricante();
            m.setId(rs.getInt("MANUFACTURER_ID"));
            m.setNome(rs.getString("NAME"));
            m.setEmail(rs.getString("EMAIL"));
            m.setCidade(rs.getString("CITY")) ;
            m.setEstado(rs.getString("STATE"));
            list.add(m);
        }
        rs.close();
        st.close();
        con.close();
        
        return list;
    }
    
    public Fabricante (){
        
    }

    public Fabricante(int id, String nome, String email, String cidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
