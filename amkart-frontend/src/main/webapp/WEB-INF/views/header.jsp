<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">AMKART</a>
    </div>
    
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Men <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">western wear</a></li>
            <li><a href="#">Bottom Wear</a></li>
            <li><a href="#">Indian wear</a></li>
          </ul>
        </li>
     <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">WOMEN<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Indian and Fushion Wear</a></li>
          <li><a href="#">Western Wear</a></li>
          <li><a href="#">Beauty and Personal Care</a></li>
        </ul>
      </li> 
      
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Home And Living<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Home Decor</a></li>
          <li><a href="#">Storage</a></li>
          <li><a href="#">Lamp and Lightings</a></li>
        </ul>
      </li>
    </ul>

     
    
    <ul class="nav navbar-nav navbar-right">
      <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="AddEntities"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    <form class="navbar-form navbar-left" action="/">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="search">
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
             <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
    </form>
    </div>
  </div>
</nav>
 </body>
</html>
