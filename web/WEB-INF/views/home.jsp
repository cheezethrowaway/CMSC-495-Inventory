<%-- 
    Document   : home
    Created on : Apr 15, 2015, 8:42:10 PM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<t:body-container title="Track IT - Home">
    
    <t:nav-bar iconClass="glyphicon glyphicon-home" username="${username}" />
    
    <div class='container-fluid text-center'>
        
        <h3>Select a task from the options below:</h3>
        
        <div class="icons-row">
            
            <div class="icon">
                <a href="${cp}/inventory">
                    <span class="glyphicon glyphicon-tasks"></span>
                    <span>View Inventory</span>
                </a>
            </div>
            
            <div class="icon">
                <a href="${cp}/inventory/create">
                    <span class="glyphicon glyphicon-plus-sign"></span>
                    <span>Create Item</span>
                </a>
            </div>
            
            <div class="icon">
                <a href="${cp}/reports">
                    <span class="glyphicon glyphicon-signal"></span>
                    <span>View Reports</span>
                </a>
            </div>
            
        </div>
        
        
        
    </div>
    
</t:body-container>
