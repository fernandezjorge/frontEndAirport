<html>
   <head>
      <title>Search airport by code</title>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
      <link rel='stylesheet' href='/css/style.css'>
   </head>
   <body>
      <h1 class="w-75 p-3 mx-auto">Welcome! Search the airport by CodeName</h1>
      <div class="align-middle border border-dark rounded w-75 p-3 mx-auto" style="width: 200px;">
         <hr>
         <form action="" method="get">
            <div class="input-group mb-3">
               <div class="input-group-prepend">
                  <span class="input-group-text" id="searchValue">IATA Code</span>
               </div>
               <input type="text" class="form-control" name="searchValue" placeholder="Code" aria-label="Username" aria-describedby="basic-addon1">
            </div>
            <div align="right">
            	<input type="submit" value="Submit" class="btn btn-info">
            </div>
         </form>
         <hr>
         <#if airportSearch??>
         <div class="bs-callout bs-callout-success">
            <h1>Resultado de la busqueda: </h1>
            <h2>${airportSearch}</h2>
         </div>         	
         <#else>
         <div class="bs-callout bs-callout-danger">
            <h1>No existe!</h1>
         </div>
         </#if>
         <hr>
         <div align="right">
            <a class="align-right btn btn-info" href="/frontEnd/" role="button">Index</a>
         </div>
      </div>
   </body>
</html>