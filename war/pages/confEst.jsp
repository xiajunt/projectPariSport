<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

<title>Jumbotron Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="../../dist/css/bootstrap.css" rel="stylesheet">
<link href="../../dist/css/bootstrap-responsive.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <style>
    #menu {
    	   background-color:#ccc;
    	   height: 600px;
    	}
    </style>
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div class="container">
				<div class="row">
					<div class="navbar-collapse collapse">
						<form action="#" method="get" class="navbar-form navbar-right"	role="form">
							<div class="input-group">
								<!-- USE TWITTER TYPEAHEAD JSON WITH API TO SEARCH -->
								<input class="form-control" id="system-search" name="q"	placeholder="Search for" required>
								 <span	class="input-group-btn">
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


		<div class="container">
			<!-- Example row of columns -->
			<div class="row">
				<div class="col-md-3" id="menu">
					<h2>Menu</h2>
					<table>
						<tbody>
							<tr>
								<td><a href="pages/confEst.jsp"><small>conference Est</small></a></td>
							</tr>
							<tr>
								<td><a href="#"><small>conference Ouest</small></a></td>
							</tr>
							<tr>
								<td><a href="#"><small>toute les divisions</small></a></td>
							</tr>
						</tbody>
					</table>
				</div>
				<aside>
					<div class="col-md-5">
						<h2>liste des matchs</h2>
						<p>Donec id elit non mi porta gravida at eget metus. Fusce
							dapibus, tellus ac cursus commodo, tortor mauris condimentum
							nibh, ut fermentum massa justo sit amet risus. Etiam porta sem
							malesuada magna mollis euismod. Donec sed odio dui.</p>
						<p>
							<a class="btn btn-default" href="#" role="button">View
								details &raquo;</a>
						</p>
					</div>
				</aside>
				<div class="col-md-4">
					<h2>Heading</h2>
					<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis
						in, egestas eget quam. Vestibulum id ligula porta felis euismod
						semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
						condimentum nibh, ut fermentum massa justo sit amet risus.</p>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
			</div>
		</div>
		<hr>

		<footer>
			<p>&copy; Company 2013</p>
		</footer>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>
	<script src="../../dist/js/bootsnipp.js"></script>
</body>
</html>
