package com.example.identity_service.dto.request;

import java.util.Set;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
// lớp gửi token để xác thực
public class RoleRequest {
    String name;
    String description;
    Set<String> permissions;
}
