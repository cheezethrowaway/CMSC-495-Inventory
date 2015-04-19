<%-- 
    Document   : login-reset
    Created on : Apr 15, 2015, 9:53:44 PM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
 
<t:body-container title="Track IT - Find Username">
    
        
        <span class="col-lg-2"></span>
        
        <div class="login-container col-lg-8">

            <div class="jumbotron">
                
                <h1 class="text-center">MGSH Track-IT</h1>  
                
                <h1 class="text-center"><small>Find Username</small></h1>
                
                <p class="lead text-center">Enter your email to receive your username</p>
                
                <form action="${cp}/login/username" method="post" id="loginForm" name="loginForm">
                    
                    <div class="form-group container-fluid">
                        <span class="col-lg-4">
                            <label for="email" class="pull-right">Email Address</label>
                        </span>
                        <span class="col-lg-5">
                            <input type="email" id="email" name="email" class="form-control" />
                        </span>
                    </div>
                    
                    <div class="container-fluid">
                        <span class="col-lg-9">
                            <button type="submit" class="btn btn-lg btn-success pull-right">Find Username</button>
                        </span>
                    </div>
                    
                    <div class="container-fluid ${msgClass} text-center">
                        ${msg}
                    </div>
                    
                    <div class="container-fluid text-center">
                        You can return to the <a href="${cp}/login">login page</a> when you're ready.
                    </div>
                    
                </form>
                
            </div>
        
        </div>
        
        <span class="col-lg-2"></span>
    
</t:body-container>
