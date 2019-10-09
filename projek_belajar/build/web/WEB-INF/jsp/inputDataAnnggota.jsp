<%-- 
    Document   : inputDataAnnggota
    Created on : Oct 4, 2019, 2:08:48 PM
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
            <div id="s">

            </div>
            <form:form id="formInput" action="simpanDataAnggota.htm" modelAttribute="dto" method="POST">
                <h1 align="center" id="tulis">Input Data Anggota</h1> 
                <div id="s">
                </div>
                <table align="center">
                    <tr><td><h4><form:label  id="tulis"  path="no">Id</form:label></h4></td><td>:</td><td><form:input  path="no" placeholder="Masukkan No" class="form-control"></form:input></td></tr>
                    <tr><td><h4><form:label  id="tulis"  path="nama">Nama</form:label></h4></td><td>:</td><td><form:input path="nama" placeholder="Masukkan Nama" class="form-control"></form:input></td></tr>
                    <tr><td><h4><form:label  id="tulis"  path="jurusan">Jurusan</form:label></h4></td><td>:</td><td><form:input path="jurusan" placeholder="Masukkan Jurusan" class="form-control"></form:input></td></tr>
                    <tr><td><h4><form:label  id="tulis"  path="alamat">Alamat</form:label></h4></td><td>:</td><td><form:input path="alamat" placeholder="Masukkan Alamat" class="form-control"></form:input></td></tr>
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
                                <div id="s">

                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <form:button id="btnasli2" value="simpan">Simpan</form:button>
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
