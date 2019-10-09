<%-- 
    Document   : dataPinjaman
    Created on : Oct 5, 2019, 5:09:30 PM
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
        <h1 align="center">Data Pinjaman</h1>
        <div>
        <c:url var="tambah" value="tambahDataPinjaman.htm"></c:url>
        <button id="tambahPinjaman" class="btn btn-default" ><a  href="${tambah}">Tambah Data</a></button>
        </div>
        <div id="div">
        <table border="2" class="display table table-bordered" id="hidden-table-info">
            <tr>
                <th>Id Pinjaman</th>
                <th>Nama Anggota</th>
                <th>Nama Buku</th>
                <th>Tanggal Pinjaman</th>
                <th>Tanggal Kembali</th>
                <th>Aksi</th>
            </tr>
            <c:forEach var="dataDto" items="${dto}">
            <tr>
                <td>${dataDto.id_pinjaman}</td>
                <td>${dataDto.id_anggota}</td>
                <td>${dataDto.id_buku}</td>
                <td>${dataDto.tgl_pinjam}</td>
                <td>${dataDto.tgl_kembali}</td>
                <c:url var="update" value="updatePinjaman.htm">
                    <c:param name="id_pinjaman" value="${dataDto.id_pinjaman}"></c:param>
                </c:url>
                <td><a href="${update}">Update</a></td>
            </tr>    
            </c:forEach>
            
        </table>
        </div>
    </body>
    <style>
        #div{
            margin-top : 20px;
        }
    </style>
</html>
