# springBootSample
Simple SpringbBoot Sample without any DB --> Minimal Dependencies + Swagger

1. Either clone / Download Zip.


2. Build it and you are ready to go.


Minimum dependencies :

dependency 1 : <artifactId>spring-boot-starter-web</artifactId> 
				--> Includes libraries of Tomcat Server / Basic Springboot 	& other libraries required to get started with application.

dependency 2 : <artifactId>spring-boot-devtools</artifactId> 
				--> This dependency helps you validate your changes without restarting your application again & again.

dependency 3 : <artifactId>springfox-swagger2</artifactId>
				--> This helps to configure your swagger class configurations.

dependency 4 : <artifactId>springfox-swagger-ui</artifactId>
				--> This will generate Swagger UI for your Services/ APIs written in Controllers.
				
Plugin :

	<plugin>			
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
	</plugin>
	
	--> This above plugin helps in building the deployable jar in your target folder.
	
	Steps to generate jar:
	
	Make sure your project dont have any red marking errors.
		
		If Yes
			then
				1.Right click on your project --> Maven 
				2.Update Project --> Check the box of your project Name 
				3.At below check all the boxes --> Click Ok.
				
		If No errors
			then
				1.Simply Right Click on project --> Run as --> Select Maven Install.
				2.after Build is done, you can find you project Deployable jar under target folder.
				

				----------------------------------X----------------------------------