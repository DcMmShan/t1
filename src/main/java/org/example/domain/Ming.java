package org.example.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ming {
    @TableId("id")
    private Integer id;
    private String name;
    private String nation;
    private String birthyear;
    private String diedyear;
    private String diedage;
    private String story;
}