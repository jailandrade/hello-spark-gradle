import static spark.Spark.*;

public class App {
	public static void main(String[] args) {
	
	staticFileLocation("/public/"); 
	
	get("/hello", (request, response) -> "Hello world");

	get("/letter", (request, response) -> 
			"<!DOCTYPE html>" +
			"<html>" +
			"<head>" +
			"<title>Letter</title>" + 
			"<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-beta/css/bootstrap.min.css'>" +
			"</head>" +
			"<body>" +
			"<div class='container'>" +
			"<h1>Hello dear friend</h1>" +
			"<p>I am writing to announce my resignation from Company Name, effective two weeks from this date.</p>" +
			"<p>This was not an easy decision to make. The past ten years have been very rewarding. I've enjoyed working for you and managing a very successful team dedicated to a quality product delivered on time.</p>" + 
			"<p>Thank you for the opportunities for growth that you have provided me.</p>" + 
			"<p>I wish you and the company all the best. If I can be of any help during the transition, please don't hesitate to ask.</p>" + 
			"<p><img src='/images/firma.png' alt='signature'></p>" + 
			"</div>" +
			"</body>" +
			"</html>"
	);
  }
}
