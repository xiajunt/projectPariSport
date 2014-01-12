 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
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
	
	.selectedBet:hover {
		cursor: pointer;
	}

	.thumbnail .caption-full {
  		padding: 9px;
  		color: #333;
	}
	
	#betSelections{
		background-color:#4B4B4B;
		color: white;
	}
	
	footer {
 		margin: 50px 0;
	}
	</style>
	
    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.css" rel="stylesheet">
    <script src="../../dist/js/hashset.js"></script>
    <script src="../../dist/js/hashtable.js"></script>
    <script src="../../dist/js/jshashset.js"></script>
    <script src="../../dist/js/json2.js"></script>
	<script>
	var mapBettings = new HashSet();
	
	serialize = function(obj, prefix) {
		  var str = [];
		  for(var p in obj) {
		    var k = prefix ? prefix + "[" + p + "]" : p, v = obj[p];
		    str.push(typeof v == "object" ?
		      serialize(v, k) :
		      encodeURIComponent(k) + "=" + encodeURIComponent(v));
		  }
		  return str.join("&");
	}

	function addBet(gameId,teamIdSelected,teamNameSelected, info){
		 var obj = document.getElementById("betSelections");
		 var intId = $("#listBets div").length + 1;
	     var fieldWrapper = $("<div class=\"fieldwrapper\" id=\"field" + intId + "\"/>");
	     var fName = $("<span title='"+info+", Full Time Result'>"+teamNameSelected+"</div> &nbsp;");
	     var removeButton = $("<input type=\"button\" class=\"remove\" value=\"-\" />");
	        removeButton.click(function() {
	        	mapBettings.remove(gameId);
	            $(this).parent().remove();
	            if(mapBettings.isEmpty()){
	            	obj.style.visibility="hidden";
	            }
	        });
	     	        
	     if(mapBettings.contains(gameId) ==! true ){
	    	 obj.style.visibility="visible";
	    	 mapBettings.add(gameId, teamIdSelected);
	    	 fieldWrapper.append(fName);
		     fieldWrapper.append(removeButton);
		     $("#listBets").append(fieldWrapper);
	     }			
	}
	
	function sendBet(){
		if (confirm('Are you sure you confirm your bet ?')) { 
			alert(mapBettings);
		}
	}
	</script>
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
      		<a href="/login" class="list-group-item" ><i class="glyphicon glyphicon-off"></i> Sign in</a>
          </div>
          <div id="betSelections" style="visibility:hidden;">
          	<p>
          		<label>Selections</label>
          	</p>
          	<div id="listBets" >
          	</div>
          	<p>
          		<label>Stake</label>
          		<input type="text" />
          	</p>
          	
          	<p>
          		<center>
          			<button type="button" class="btn btn-warning" onclick="sendBet();">Accept</button>
          		</center>
          	</p>
          	
          	<br/>
          	<div class="alert alert-warning">Please log in to place bet</div>
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
							<td><a href="javascript:alert('ALERT');"><span class="glyphicon glyphicon-stats"></span></a></td>
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