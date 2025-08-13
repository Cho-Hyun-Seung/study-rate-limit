package com.toki.openapiserver.spot.controller;

import com.toki.openapiserver.spot.service.SpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/spot")
public class SpotController {
    public final SpotService spotService;


    /* TODO 목록 조회 */


    /* TODO 상세 조회 */
}
