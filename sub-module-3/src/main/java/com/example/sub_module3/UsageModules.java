package com.example.sub_module3;

import com.example.sub_child_module3.SubChildModule3;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class UsageModules {

    private SubChildModule3 subChildModule1 = SubChildModule3.builder().field("field").build();

    public void method() {
        System.out.println(StringUtils.capitalize("london"));
    }

}
