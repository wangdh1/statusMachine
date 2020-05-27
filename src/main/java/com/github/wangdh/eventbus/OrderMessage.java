package com.github.wangdh.eventbus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wdh
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderMessage {
    private String content;
}
