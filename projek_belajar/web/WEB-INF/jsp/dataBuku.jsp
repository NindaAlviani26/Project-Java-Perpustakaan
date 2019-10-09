<%-- 
    Document   : dataBuku
    Created on : Oct 1, 2019, 8:55:20 PM
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
        <h1 align="center">Data Buku</h1>
        <div>
        <c:url var="tambah" value="tambahData.htm"></c:url>
        <button id="tambahBuku" class="btn btn-default"><a  href="${tambah}">Tambah Data</a></button>
        </div>
        <div id="div"> 
        <table border="2" class="display table table-bordered" id="hidden-table-info">
            <tr>
                <th>Id</th>
                <th>Nama Buku</th>
                <th>Kategori Buku</th>
                <th colspan="2">Aksi</th>
            </tr>
            <c:forEach var="dataDto" items="${dto}">
            <tr>
                <td>${dataDto.id}</td>
                <td>${dataDto.nama_buku}</td>
                <td>${dataDto.kategori}</td>
                <c:url var="update" value="updateBuku.htm">
                    <c:param name="id" value="${dataDto.id}"></c:param>
                </c:url>
                <c:url var="delete" value="deletData.htm">
                    <c:param name="id" value="${dataDto.id}"></c:param>
                </c:url>
                <td><a href="${update}">Update</a></td>
                <td><a href="${delete}">Delete</a></td>
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
