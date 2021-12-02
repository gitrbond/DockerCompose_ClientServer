package ru.sbt.mipt.pdris.hwdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerCompose_ServerApplication {
    /*
    This is a default endpoint of server application
    This method will return default message from server
    */
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<String> callServer() {
        return new ResponseEntity<>("Server: Hello from server", HttpStatus.OK);
    }


    /*
    This is an endpoint which will internally called by client application using RestTemplate
    This method will return message coming from server to client
    */
    @RequestMapping(method = RequestMethod.GET, value = "/callServer")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Server: Hello, I heard your call", HttpStatus.OK);
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerCompose_ServerApplication.class, args);
    }

}
