package br.com.fatecpg.projeto05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Cliente {

    private int id;
    private String nome;
    private String email;

    public static ArrayList<Cliente> getList() throws Exception {
        ArrayList<Cliente> list = new ArrayList<>();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMER");
        while (rs.next()) {
            Cliente c = new Cliente();
            c.setId(rs.getInt("CUSTOMER_ID"));
            c.setNome(rs.getString("NAME"));
            c.setEmail(rs.getString("EMAIL"));
            list.add(c);
        }
        rs.close();
        st.close();
        con.close();
        return list;
    }

    public Cliente() {

    }

    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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

}
