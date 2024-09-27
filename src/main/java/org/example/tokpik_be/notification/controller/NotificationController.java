package org.example.tokpik_be.notification.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.tokpik_be.notification.dto.request.NotificationDeleteRequest;
import org.example.tokpik_be.notification.service.NotificationCommandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "알림 API", description = "알림 연관 API")
@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationCommandService notificationCommandService;

    @Operation(summary = "알림 삭제", description = "알림 삭제")
    @ApiResponse(responseCode = "200", description = "알림 삭제 성공")
    @DeleteMapping("/users/notifications")
    public ResponseEntity<Void> deleteNotification(@RequestBody NotificationDeleteRequest request) {

        notificationCommandService.deleteNotification(request);

        return ResponseEntity.ok().build();
    }
}
