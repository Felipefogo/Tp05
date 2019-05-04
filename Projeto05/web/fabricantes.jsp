<%-- 
    Document   : fabricantes
    Created on : 03/05/2019, 20:15:43
    Author     : Casa
--%>

<%@page import="br.com.fatecpg.projeto05.Fabricante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto 05 - Fabricantes</title>
    </head>
    <body>
    <center>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <div class="container">
            <div clas="row">
                <div class="col-md-12">

                    <h1>Projeto - 05</h1><br>
                    <h2>Fabricantes</h2><br>

                    <% try { %>
                    <div class ="table-responsive-md">
                        <div class="table">

                            <table class="table table-bordered table-striped table-dark">
                                <tr>
                                    <th style="text-align: center">ID</th>
                                    <th style="text-align: center">Nome</th>
                                    <th style="text-align: center">E-mail</th>
                                    <th style="text-align: center">Cidade</th>
                                    <th style="text-align: center">Estado</th>
                                    <th style="text-align: center">Detalhes</th>
                                </tr>
                                <% for (Fabricante m : Fabricante.getList()) {%>
                                <tr>
                                    <td style="text-align: center"><%=m.getId()%></td>
                                    <td style="text-align: center"><%=m.getNome()%></td>
                                    <td style="text-align: center"><%=m.getEmail()%></td>
                                    <td style="text-align: center"><%=m.getCidade()%></td>
                                    <td style="text-align: center"><%=m.getEstado()%></td>
                                    <td style="text-align: center"><a href="#" class="badge badge-light">Detalhes dos produtos</a></td>
                                </tr>
                                <%}%>
                            </table>
                        </div>
                    </div>
                    <%} catch (Exception e) {%>

                    <%}%>
                </div>
            </div>
        </div>
    </center>
    <%@include file="WEB-INF/jspf/footer.jspf"%>
</body>
</html>
