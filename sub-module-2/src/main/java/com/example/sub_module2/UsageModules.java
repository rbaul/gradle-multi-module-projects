package com.example.sub_module2;

import com.example.sub_module3.SubModule3;
import lombok.Data;

@Data
public class UsageModules {

    private SubModule3 subModule3 = SubModule3.builder().field("field").build();
}
