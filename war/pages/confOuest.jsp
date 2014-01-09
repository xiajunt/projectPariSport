<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">
<style>
#menu {
	background-color: #ccc;
	height: 600px;
}

.index {
	color: #000;
}

#menu small {
	color: #e00;
}

#live small {
	color: #000;
}
</style>
<title>Jumbotron Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="../../dist/css/bootstrap.css" rel="stylesheet">
<link href="../../dist/css/bootstrap-responsive.css" rel="stylesheet">
<link href="../../dist/css/select-menu.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container2">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="http://fr.wikipedia.org/wiki/Pari_sportif">Paris Sport</a>
			</div>
			<div class="container2">
				<div class="row">
					<div class="navbar-collapse collapse">
						<form action="#" method="get" class="navbar-form navbar-right"
							role="form">
							<div class="input-group">
								<!-- USE TWITTER TYPEAHEAD JSON WITH API TO SEARCH -->
								<input class="form-control" id="system-search" name="q"
									placeholder="Search for" required> <span
									class="input-group-btn">
									<button type="submit" class="btn btn-default">
										<i class="glyphicon glyphicon-search"></i>
									</button>
								</span>
							</div>
						</form>
					</div>
					<!--/.navbar-collapse -->
				</div>
			</div>
		</div>
	</div>

	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container2">
			<!-- Example row of columns -->
			<div class="row">
				<aside>
					<div class="col-md-2" id="menu">
						<a class="index" href="../index.html"><h2>Menu</h2></a>
						<table class="table">
							<tbody>
								<tr>
									<td><a href="confEst.jsp"><small>conference Est</small></a></td>
								</tr>
								<tr>
									<td><a href="confAtlantic.jsp"><small>conference Atlantique</small></a></td>
								</tr>
								<tr>
									<td><a href="confPacific.jsp"><small>conference Pacific</small></a></td>
								</tr>
								<tr>
									<td><a href="#"><small>toute les divisions</small></a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</aside>
				<div class="col-md-7" id="live">
					<h2>Match en cours</h2>
					<table class=" table-list-search">
						<tbody>
							<tr>
								<td><div>
										<a href="#"><small>Match 1</small></a>
									</div></td>
							</tr>
							<tr>
								<td><a href="#"><small>Match 2</small></a></td>
							</tr>
							<tr>
								<td><a href="#"><small>Match 3</small></a></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-md-3">
					<h2>Liste des equipes</h2>
					<p>Liste des equipes de la conference Ouest.</p>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="../../dist/js/bootstrap.js"></script>
	<script src="../../dist/js/bootsnipp.js"></script>
</body>
<footer> &copy; Company 2013 </footer>
</html>
