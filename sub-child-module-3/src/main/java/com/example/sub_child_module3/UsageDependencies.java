package com.example.sub_child_module3;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class UsageDependencies {

    public void method() {
        System.out.println(StringUtils.capitalize("london"));
    }

}
