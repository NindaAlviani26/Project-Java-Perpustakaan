<%-- 
    Document   : anggota
    Created on : Oct 2, 2019, 1:41:17 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="frame.jsp" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Data Anggota</h1>
        <c:url var="tambah" value="tambahAnggota.htm"></c:url>
        <button id="tambah" class="btn btn-default"><a  href="${tambah}">Tambah Data</a></button>
        <div id="div">
            <table border="2" class="display table table-bordered" id="hidden-table-info">
            <tr>
                <th>No</th>
                <th>Nama</th>
                <th>Jurusan</th>
                <th>Alamat</th>
                <th colspan="2">Aksi</th>
            </tr>
            <c:forEach var="dataDto" items="${dto}">
            <tr>
                <td>${dataDto.no}</td>
                <td>${dataDto.nama}</td>
                <td>${dataDto.jurusan}</td>
                <td>${dataDto.alamat}</td>
                <c:url var="update" value="updateAnggota.htm">
                    <c:param name="no" value="${dataDto.no}"></c:param>
                </c:url>
                <c:url var="delete" value="deletAnggota.htm">
                    <c:param name="no" value="${dataDto.no}"></c:param>
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
