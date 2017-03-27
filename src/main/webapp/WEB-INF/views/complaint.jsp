<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-aria.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-messages.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.js"></script>
  	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
	  <link rel="stylesheet" href="${animateCSS}">	
	  <link rel="stylesheet" href="${styleCSS }">
	  

	 
	  
	  <!-- CSS Style code -->
 <style type="text/css">
      body {
  font: 400 15px/1.8 Lato, sans-serif;
  color: #777;
}

h3, h4 {
  margin: 10px 0 30px 0;
  letter-spacing: 10px;
  font-size: 20px;
  color: #111;
}

.container {
  padding: 80px 120px;
}

.person {
  border: 10px solid transparent;
  margin-bottom: 25px;
  width: 80%;
  height: 80%;
  opacity: 0.7;
}

.person:hover {
  border-color: #f1f1f1;
}

.carousel-inner img {
  -webkit-filter: grayscale(0%);
  width: 100%; /* Set width to 100% */
  margin: auto;
}

.carousel-caption h3 {
  color: #000000 !important;
}

@media ( max-width : 600px) {
  .carousel-caption {
    display: none;
    /* Hide the carousel text when the screen is less than 600 pixels wide */
  }
}

.bg-1 {
  background: #2d2d30;
  color: #bdbdbd;
}

.bg-1 h3 {
  color: #fff;
}

.bg-1 p {
  font-style: italic;
}

.list-group-item:first-child {
  border-top-right-radius: 0;
  border-top-left-radius: 0;
}

.list-group-item:last-child {
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}

.thumbnail {
  padding: 0 0 15px 0;
  border: none;
  border-radius: 0;
}

.thumbnail p {
  margin-top: 15px;
  color: #555;
}

.btn {
  padding: 10px 20px;
  background-color: #333;
  color: #f1f1f1;
  border-radius: 0;
  transition: .2s;
}

.btn:hover, .btn:focus {
  border: 1px solid #333;
  background-color: #fff;
  color: #000;
}

.modal-header, h4, .close {
  background-color: #333;
  color: #fff !important;
  text-align: center;
  font-size: 30px;
}

.modal-header, .modal-body {
  padding: 40px 50px;
}

.nav-tabs li a {
  color: #777;
}

#googleMap {
  width: 100%;
  height: 400px;
  -webkit-filter: grayscale(100%);
  filter: grayscale(100%);
}

.navbar {
  font-family: Montserrat, sans-serif;
  margin-bottom: 0;
  background-color: #2d2d30;
  border: 0;
  font-size: 11px !important;
  letter-spacing: 4px;
  opacity: 0.9;
}

.navbar li a, .navbar .navbar-brand {
  color: #d5d5d5 !important;
}

.navbar-nav li a:hover {
  color: #fff !important;
}

.navbar-nav li.active a {
  color: #fff !important;
  background-color: #29292c !important;
}

.navbar-default .navbar-toggle {
  border-color: transparent;
}

footer {
  background-color: #2d2d30;
  color: #f5f5f5;
  padding: 32px;
}

footer a {
  color: #f5f5f5;
}

footer a:hover {
  color: #777;
  text-decoration: none;
}

.form-control {
  border-radius: 0;
}

textarea {
  resize: none;
}
</style>
	
<title>Login</title>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
  data-offset="50">
<div class="container" style="background-image: url('<c:url value="/resources/images/bg.jpg"/>')">
  <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
          data-target="#myNavbar">
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span
            class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#myPage">UNCC Apartments</a>
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right">
          <li><a href="#myPage">HOME</a></li>
          <li><a href="apartment">Available Apartments</a></li>
          <li><a href="#contact">Contact</a></li>
          <li><a href="signup">Sign Up!</a></li>
        </ul>
      </div>
    </div>
  </nav>

<br>
<br>

<!-- Login form code -->
<div class="container text-center">
		<p id="test"> </p>
		<div id="Complaint" >
			<form:form name="ComplaintForm" method="post" onsubmit="validate(this);" action="complaint.submit" modelAttribute="complaint_bean">
				<div class="box-header">
					<h2>Lodge a Complaint</h2>
				</div>
				<div class="container">
				<p>Complaint_type</p>
				<div class="dropdown">
   				 <button class="btn btn-primary dropdown-toggle" name="comp" type="button" data-toggle="dropdown">Select
   				 <span class="caret"></span></button>
   				 <ul class="dropdown-menu">
   				   <li><a href="#">Plumbing</a></li>
    			  <li><a href="#">Carpentry</a></li>
     				 <li><a href="#">Bug treatment</a></li>
     				 <li><a href="#">Other</a></li>
    			</ul>
  				</div>
  				</div>
  				<div class="radio">
				<p>Severity</p>
 				 <label><input type="radio" name="optseverity">High</label>
				</div>
				<div class="radio">
				  <label><input type="radio" name="optseverity">Medium</label>
				</div>
				<div class="radio">
				  <label><input type="radio" name="optseverity">Low</label>
				</div>
				<div class="form-group">
 				 <label for="comment" name="desc">Complaint Description</label>
 				 <textarea class="form-control" rows="5" id="comment"></textarea>
				</div>
				<br/>
				<label id="ErrorMessage">${loginErrorMessage }</label><br/>
				<button type="submit" id="submit" >Submit</button>
				<br/>
			</form:form>
		</div>
		<script type="text/javascript">
		  document.getElementById('test').innerHTML="Submitting the complaint!!";
		</script>
	<script type="text/javascript">
	  function validate(form){
		  var username = form.username.value;
		  var password = form.password.value;
		  form.username.style.borderColor="#ccc";
		  form.password.style.borderColor="#ccc";
		  var obj1 = form.getElementById('desc');
		  ErrorText= ""; 
		  if ( form.comp.selectedIndex == 0 ) { alert ( "Please select the complaint_type" ); return false; } 
	  	  else if ( ( form.optseverity[0].checked == false ) && ( form.optseverity[1].checked == false )&&(form.optseverity[0].checked == false) ) { alert ( "Please choose severity" ); return false; }
	  	  else if(trimfield(obj1.value) == '') 
		         {      
		              alert("Please Provide complaint description!");
		              obj1.focus();
		              return false;       
		         }
	  	  else
	  		  form.submit() 
	  		  } 
	  </script>
</div>
</div>
</body>
</html>