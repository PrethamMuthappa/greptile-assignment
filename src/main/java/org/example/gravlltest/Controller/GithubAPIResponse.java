package org.example.gravlltest.Controller;

import org.example.gravlltest.Service.GithubAPIService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController("/logs")
public class GithubAPIResponse {

    private final GithubAPIService githubAPIService;

    public GithubAPIResponse(GithubAPIService githubAPIService) {
        this.githubAPIService = githubAPIService;
    }

    public ResponseEntity<?>responseEntity(){
        return new ResponseEntity<>(githubAPIService.ExtractAPI(), HttpStatus.OK);
    }
}
