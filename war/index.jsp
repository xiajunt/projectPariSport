 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.google.appengine.api.users.*" %>
<%@ page import="projetPariSport.structObject.Account" %>
<%@ page import="projetPariSport.tools.DataCenterTool" %>

<% UserService userService = UserServiceFactory.getUserService(); %>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>AAR Gambling!</title>
    <style>
    body {
  		padding-top: 70px
	}

	.thumbnail img {
  		width: 100%;
	}

	.ratings {
  		color: #d17581;
  		padding-left: 10px;
  		padding-right: 10px;
	}	

	.thumbnail {
  		padding: 0;
	}

	.thumbnail .caption-full {
  		padding: 9px;
  		color: #333;
	}
	
	footer {
 		margin: 50px 0;
	}
	</style>
	
    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.css" rel="stylesheet">

  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#home">AAR</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav">
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container -->
    </nav>

    <div class="container">

      <div class="row">

        <div class="col-md-3">
          <p class="lead">Game betting</p>
          <div class="list-group text-center">
          	<!-- Lister la liste des confÃ©rences -->
          	<a href="#" class="list-group-item active">NBA</a>
      		<!-- 
      			<a href="#" class="list-group-item active">Printable</a>
            	<a href="#" class="list-group-item">Cupcake Wrappers</a>
            	<a href="#" class="list-group-item">Authentic Dragon Bones</a>
      		-->
			<% if (userService.getCurrentUser() == null) { %>
      			<a href="<%=userService.createLoginURL("/")%>" class="list-group-item" ><i class="glyphicon glyphicon-off"></i>Sign in</a>
			<% }
			else { 
				Account ac = DataCenterTool.getAccount(userService.getCurrentUser().getEmail(), userService.getCurrentUser().getNickname());%>
				<a href="<%=userService.createLogoutURL("/")%>" class="list-group-item" ><i class="glyphicon glyphicon-off"></i>Log out</a>
				<p class="list-group-item">Hello <%=userService.getCurrentUser().getNickname()%>
				<br />
				Token : <%=ac.getToken() %>
				<br />
				Number of bet : <%=DataCenterTool.getNbrBetting(ac) %></p>
			<% } %>
          </div>
        </div>

        <div class="col-md-9">
          <div class="thumbnail" id="wrap">
          	<div class="bs-example">
          	  <p>
          	  	<h3>NBA <c:out value="${today}"/></h3>
          	  </p>
		      <table class="table table-hover">
		        <thead>
		          <tr>
		            <th>#</th>
		            <th>Game Scheduled</th>
		            <th>Away Team</th>
		            <th>Home Team</th>
		            <th>Statistics</th>
		          </tr>
		        </thead>
		        <tbody>
					<c:forEach var="scheduleToday" items="${listScheduleToday}" >
						<tr>
							<td></td>
							<td>${scheduleToday.gameScheduled}</td>
							<td>${scheduleToday.gameHomeTeam}</td>
							<td>${scheduleToday.gameAwayTeam}</td>
							<td><a href="javascript:alert('ALERT');"><span class="glyphicon glyphicon-stats"></span></a></td>
						</tr>
					</c:forEach>
		        </tbody>
		      </table>
		    </div> 
          </div> 
          <div class="thumbnail" id="today">
          	<div class="bs-example">
          	  <p>
          	  	<h3>NBA <c:out value="${tomorrow}"/></h3>
          	  </p>
		      <table class="table table-hover">
		        <thead>
		          <tr>
		            <th>#</th>
		            <th>Game Scheduled</th>
		            <th>Away Team</th>
		            <th>Home Team</th>
		            <th>Statistics</th>
		          </tr>
		        </thead>
		        <tbody>
					<c:forEach items="${listScheduleTomorrow}" var="scheduleTomorrow" varStatus="status">
						<tr>
							<td>${status.count}</td>
							<td>${scheduleTomorrow.gameScheduled}</td>
							<td>${scheduleTomorrow.gameHomeTeam}</td>
							<td>${scheduleTomorrow.gameAwayTeam}</td>
							<td><a href="javascript:alert('ALERT');"><span class="glyphicon glyphicon-stats"></span></a></td>
						</tr>
					</c:forEach>
		        </tbody>
		      </table>
		    </div> 
          </div> 
      </div>

    </div><!-- /.container -->

    <div class="container">
      <hr>

      <footer>
        <div class="row">
          <div class="col-lg-12">
            <p>Copyright &copy; JLR 2013</p>
          </div>
        </div>
      </footer>

    </div><!-- /.container -->

    <!-- JavaScript -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="../../dist/js/bootstrap.js"></script>
  </body>
</html>