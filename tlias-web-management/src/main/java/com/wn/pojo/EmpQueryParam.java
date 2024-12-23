package com.wn.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 这个类是：
 *
 * @author: CHINHAE
 * @date: 2024/12/4 14:18
 * @version: 1.0
 */
@Data
public class EmpQueryParam {
    private Integer page = 1; // 页码
    private Integer pageSize = 10; // 每页显示条数
    private String name; // 姓名
    private Integer gender; // 性别
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate begin; // 入职时间 - 开始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate end; // 入职时间 - 结束
}
