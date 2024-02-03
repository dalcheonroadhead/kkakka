package org.ssafy.ssafy_common2.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ssafy.ssafy_common2._common.response.ApiResponseDto;
import org.ssafy.ssafy_common2._common.response.MsgType;
import org.ssafy.ssafy_common2._common.response.ResponseUtils;
import org.ssafy.ssafy_common2._common.security.UserDetailsImpl;
import org.ssafy.ssafy_common2.user.dto.Response.UserDataResponseDto;
import org.ssafy.ssafy_common2.user.service.UserDataService;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserDataController {

    private final UserDataService userDataService;

    @GetMapping("/users/point")
    public ApiResponseDto<Map<String,Integer>> getPoint(@AuthenticationPrincipal UserDetailsImpl userDetails) {

        Map<String, Integer> map = userDataService.getPoint(userDetails.getUser());
        return ResponseUtils.ok(map, MsgType.SEARCH_POINT_SUCCESSFULLY);

    }

    @GetMapping("/users/data")
    public ApiResponseDto<UserDataResponseDto> getEmailProfileImg(@AuthenticationPrincipal UserDetailsImpl userDetails) {

        UserDataResponseDto map = userDataService.getEmailProfileImg(userDetails.getUser());
        return ResponseUtils.ok(map, MsgType.SEARCH_EMAIL_PROFILE_IMG_SUCCESSFULLY);

    }
}
