package snippet;

public class Snippet {
	version: "3.8"
	services:
	  web:
	   build: .
	   image: prachi8/app-products-infra
	   volumes:
	    - app-data:/var/bin
	   ports:
	    - 3000:3000
	    
	volumes:
	 app-data:	 
}

