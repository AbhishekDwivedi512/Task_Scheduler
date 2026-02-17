package com.task.managemnt.system.DTO;


import lombok.*;

@Builder
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class CheckDto {
    private Long id;
    private String title;
}
