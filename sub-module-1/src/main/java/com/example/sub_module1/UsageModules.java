package com.example.sub_module1;

import com.example.sub_child_module1.SubChildModule1;
import com.example.sub_child_module2.SubChildModule2;
import lombok.Data;

@Data
public class UsageModules {

    private SubChildModule1 subChildModule1 = SubChildModule1.builder().field("field").build();

    private SubChildModule2 subChildModule2 = SubChildModule2.builder().field("field").build();

}
