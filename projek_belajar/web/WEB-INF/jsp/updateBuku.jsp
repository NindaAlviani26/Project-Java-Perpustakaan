<%-- 
    Document   : updateBuku
    Created on : Oct 2, 2019, 9:44:38 AM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="frame.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <img src="img/profil.jpg" id="gmb"/>
        <div id="kotak">
            <form:form id="formInput" action="updateData.htm" modelAttribute="dto" method="POST">
                <h1 align="center" id="tulis">Update Data</h1> 
                <div id="s">

                </div>
                <table align="center">
                    <tr>
                        <td>
                            <div id="s">

                            </div>
                        </td>
                    </tr>
                    <tr><td><h4><form:label id="tulis" path="id">Id</form:label></h4></td><td>:</td><td><form:input readonly="true" path="id" placeholder="Masukkan Id" class="form-control"></form:input></td></tr>
                    <tr><td><h4><form:label id="tulis" path="nama_buku">Nama</form:label></h4></td><td>:</td><td><form:input path="nama_buku" placeholder="Masukkan Id" class="form-control"></form:input></td></tr>
                    <tr><td><h4><form:label id="tulis" path="kategori">Jenis</form:label></h4></td><td>:</td><td><form:input path="kategori" placeholder="Masukkan Id" class="form-control"></form:input></td></tr>
                        <tr>
                            <td>
                                <div id="s">

                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div id="s">

                                </div>
                            </td>
                        </tr>

                    </table>
                    <table align="center">
                        <tr>
                            <td>
                            <form:button value="simpan" id="btnasli2" >Simpan</form:button>
                            </td>
                            <td>
                            <c:url var="but" value="pinjaman.htm"></c:url>
                            <div id="btnasli" ><a href="${but}">Batal</a></div>
                        </td>
                    </tr>
                </table>
            </form:form>
    </body>
     <style>
    #kotak{
            width: 35%;
            height: 450px;
            background: #00c5de;
            margin-left: 32.5%;
            padding-top: 10px;  
            border-radius: 10px;
            position: relative;
            margin-top: -550px;
        }
        #tulis{
            color:white;
        }
        #s{
            width: 100px;
            height: 20px;
        }
        #gmb{
            margin-top: -20px;
            opacity: 0.7;
            filter: alpha(opacity=50); /* For IE8 and earlier */
            width: 100%;
            height: 670px;
        }
        /*        body {
                    background-image: url("img/profil.jpg");
                    background-color: #cccccc;
                    
                }*/
        #btnasli{
            width: 95px;
            border-radius: 10px;
            height: 40px;
            background: darkred;
            color:white;
            margin-left: 65%;
            /*margin-top: -1000px;*/
            position: relative;
            padding-top:10%;
            padding-left:35%;

        }


        #btnasli:hover {
            background-color: #c6080d;
        }
        #btnasli2{
            width: 95px;
            border-radius: 10px;
            height: 40px;
            background: darkblue;
            color:white;
            margin-left: -45%;
            /*margin-top: -1000px;*/
            position: relative;

        }

        #btnasli2:hover {
            background-color: #08C;
        }
        a{
            color: white;
            font-size: 12px;
        }

    </style>

</html>
