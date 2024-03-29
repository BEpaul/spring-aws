package com.SpringAWS.study.web;

import com.SpringAWS.study.service.posts.PostsService;
import com.SpringAWS.study.web.dto.PostsResponseDto;
import com.SpringAWS.study.web.dto.PostsSaveRequestDto;
import com.SpringAWS.study.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    // 게시글 저장
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    // 게시글 수정
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    // 게시글 조회
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    // 게시글 삭제
    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}

/**
  @PathVariable: 경로에 변수를 넣을 수 있도록 해줌!
  @g
 */