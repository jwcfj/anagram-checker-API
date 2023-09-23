package com.example.mvchallenge.controler;


import com.example.mvchallenge.anagram.AnagramCheckerService;
import com.example.mvchallenge.anagram.AnagramRequestDataDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;


@RestController
@RequestMapping(value = "/anagram", produces = {"application/json"})
@Tag(name = "anagram-api")
public class AnagramController {

    @Operation(summary = "Verify if two input words are anagrams by ordering both words using the merge sort algorithm, which has a time complexity of O(n log(n)). This ensures that you can test with large input data without causing server crashes.", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Anagrams check was successfully performed"),
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean checkAnagram(@RequestBody AnagramRequestDataDTO anagramRequestDataDTO){
        AnagramCheckerService anagramCheckerService = new AnagramCheckerService();
        return anagramCheckerService.check(anagramRequestDataDTO.word1(), anagramRequestDataDTO.word2());
    }
}
