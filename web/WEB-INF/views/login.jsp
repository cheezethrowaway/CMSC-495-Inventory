<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
 
<t:body-container title="Track IT - Login">
    
        
        <span class="col-lg-2"></span>
        
        <div class="login-container col-lg-8">

            <div class="jumbotron">
                
                <h1 class="text-center">MGSH Track-IT</h1>  
                
                <p class="lead text-center">Please log in using your designated username and password.</p>
                
                <form action="${cp}/login" method="post" id="loginForm" name="loginForm">
                    
                    <div class="form-group container-fluid">
                        <span class="col-lg-4">
                            <label for="username" class="pull-right">Username</label>
                        </span>
                        <span class="col-lg-5">
                            <input type="text" id="username" name="username" class="form-control" />
                        </span>
                    </div>
                    
                    <div class="form-group container-fluid">
                        <span class="col-lg-4">
                            <label for="password" class="pull-right">Password</label>
                        </span>
                        <span class="col-lg-5">
                            <input type="password" id="password" name="password" class="form-control" />
                        </span>
                    </div>
                    
                    <div class="container-fluid">
                        <span class="col-lg-9">
                            <button type="submit" class="btn btn-lg btn-success pull-right">Sign In</button>
                        </span>
                    </div>
                    
                    <c:if test="${msg != null}">
                    <div class="container-fluid text-danger text-center">
                        ${msg}
                    </div>
                    </c:if>
                    
                    <div class="container-fluid text-center">
                        If you're having trouble logging in, you can <a href="${cp}/login/reset">reset your password</a>, or <a href="${cp}/login/username">find your username</a>.
                    </div>
                </form>
                
            </div>
        
        </div>
        
        <span class="col-lg-2"></span>
    
</t:body-container>
