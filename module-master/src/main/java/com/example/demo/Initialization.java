package com.example.demo;

import com.example.sub_child_module3.SubChildModule3;
import com.example.sub_module1.SubModule1;
import com.example.sub_module2.SubModule2;
import com.example.sub_module3.SubModule3;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Initialization implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        SubModule1 subModule1 = SubModule1.builder().field("field").build();

        SubModule2 subModule2 = SubModule2.builder().field("field").build();

        SubModule3 subModule3 = SubModule3.builder().field("field").build();

        SubChildModule3 subChildModule3 = SubChildModule3.builder().field("field").build();

        System.out.println(StringUtils.capitalize("london"));
    }
}
