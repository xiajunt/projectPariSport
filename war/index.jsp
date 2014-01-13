<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.google.appengine.api.users.*" %>
<%@ page import="projetPariSport.structObject.Account" %>
<%@ page import="projetPariSport.tools.DataCenterTool" %>
<%@ page import="projetPariSport.structObject.Betting" %>
<%@ page import="projetPariSport.structObject.Game" %>
<%@ page import="projetPariSport.structObject.Team" %>
<%@ page import="projetPariSport.structObject.Schedule" %>
<%@ page import="projetPariSport.parameter.Parameter" %>
<%@ page import="java.util.List" %>

<% UserService userService = UserServiceFactory.getUserService(); %>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>AAR Gambling!</title>
	
    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.css" rel="stylesheet">
    <link href="../../dist/css/custom.css" rel="stylesheet">
    <!-- JavaScript -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="../../dist/js/bootstrap.js"></script>
    <script src="../../dist/js/bootbox.js"></script>
    <script src="../../dist/js/main.js"></script>
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
          	<!-- Lister la liste des conférences -->
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
				Token : <%=ac.getToken() %></p>
				
				<input type="hidden" id="userServiceEmail" value="<%=userService.getCurrentUser().getEmail()%>" />
				<input type="hidden" id="userServiceNickName" value="<%= userService.getCurrentUser().getNickname()%>" />
				<input type="hidden" id="token" value="<%=ac.getToken() %>"/>
				
				<%List<Betting> listBetting = DataCenterTool.getNewBetting(ac);%>
				<p class="list-group-item">List of bet :</p>
				<%for (Betting b : listBetting)
					{%>
					<p class="list-group-item">Bet id : <%=b.getId()%><br />Cotation : <%=b.getCotation()%><br />Token : <%=b.getNbrBetToken()%><br /><br />
					<%List<Game> listGame = DataCenterTool.getDataCenterBettingGame(b);
					for (Game g : listGame)
					{Team t = (Team)DataCenterTool.getDataCenter(Parameter.TEAM, g.getBetTeamId());
					Schedule s = (Schedule)DataCenterTool.getDataCenter(Parameter.SCHEDULE, g.getGameId());%>
					Game at <%= s.getGameScheduled().toString()%>, I bet on the <%=t.getTeamName()%> <br />
			<%}%>
					<br />
			<%} 
			} %>
          </div>
          <div id="betSelections"  class="class="list-group text-center" style="visibility:hidden;">
          	<a href="#" class="list-group-item active">Selections</a>
			<div id="listBets" ></div>
			<a href="#" class="list-group-item text-center">
				<input type="text" placeholder="Stake..." id="stake" />
			</a>
          	<a href="#" class="list-group-item text-center">
          		<button type="button" class="btn btn-warning" onclick="sendBet();return false;">Accept</button>
          	</a>
          	<% if (userService.getCurrentUser() == null) { %>
			<a>
				<div class="alert alert-warning">Please log in to place bet</div>
			</a>
			<% }%>
          </div>
        </div>

        <div class="col-md-9">
          <div class="thumbnail" id="today">
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
					<c:forEach varStatus="status" var="scheduleToday" items="${listScheduleToday}" >
						<tr>
							<td>${status.count}</td>
							<td>${scheduleToday.gameScheduled}</td>
							<td><div class="selectedBet" onclick="addBet('${scheduleToday.gameId}','${scheduleToday.gameAwayTeam}','${listMapping[scheduleToday.gameAwayTeam]}','${listMapping[scheduleToday.gameAwayTeam]} vs ${listMapping[scheduleToday.gameHomeTeam]}');">${listMapping[scheduleToday.gameAwayTeam]}</div></td>
							<td><div class="selectedBet" onclick="addBet('${scheduleToday.gameId}','${scheduleToday.gameHomeTeam}','${listMapping[scheduleToday.gameHomeTeam]}','${listMapping[scheduleToday.gameAwayTeam]} vs ${listMapping[scheduleToday.gameHomeTeam]}');">${listMapping[scheduleToday.gameHomeTeam]}</div></td>
							<td><a href="javascript:noImplementedYet();"><span class="glyphicon glyphicon-stats"></span></a></td>
						</tr>
					</c:forEach>
		        </tbody>
		      </table>
		    </div> 
          </div> 
                     
          <div class="thumbnail" id="tomorrow">
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
							<td><div class="selectedBet" onclick="addBet('${scheduleTomorrow.gameId}','${scheduleTomorrow.gameAwayTeam}' ,'${listMapping[scheduleTomorrow.gameAwayTeam]}' ,'${listMapping[scheduleTomorrow.gameAwayTeam]} vs ${listMapping[scheduleTomorrow.gameHomeTeam]}');">${listMapping[scheduleTomorrow.gameAwayTeam]}</div></td>
							<td><div class="selectedBet" onclick="addBet('${scheduleTomorrow.gameId}','${scheduleTomorrow.gameHomeTeam}','${listMapping[scheduleTomorrow.gameHomeTeam]}','${listMapping[scheduleTomorrow.gameAwayTeam]} vs ${listMapping[scheduleTomorrow.gameHomeTeam]}');">${listMapping[scheduleTomorrow.gameHomeTeam]}</div></td>
							<td><a href="javascript:noImplementedYet();"><span class="glyphicon glyphicon-stats"></span></a></td>
						</tr>
					</c:forEach>
		        </tbody>
		      </table>
		    </div> 
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
  </body>
</html>