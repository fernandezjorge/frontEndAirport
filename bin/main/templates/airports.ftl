<html>
<head>
    <title>All Airports List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	<link rel='stylesheet' href='/css/style.css'></head>
<body>
	<h1 class="w-75 p-3 mx-auto">Sorted Airports by IATA Code</h1>
		<div class="align-middle border border-dark rounded w-75 p-3 mx-auto" style="width: 250px;">
			<hr>
			<table>				
				<div class="list-group">
					<#list airports as airport>
		    			<tr> 	     
		        			<a href="#" class="list-group-item list-group-item-action">${airport.airportCode}</a>
		    			</tr>
					</#list>
				</div>				
			</table>
			<hr>	
			<div align="right">
				<a class="align-right btn btn-info" href="/frontEnd/" role="button">Index</a>
			</div>			
		</div>		
</body>
</html>