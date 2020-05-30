package com.macro.mall;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Code for the production of MBG
 * Created by macro on 2018/4/26.
 */
public class Generator {
    public static void main(String[] args) throws Exception {
//warning message during MBG execution
        List<String> warnings = new ArrayList<String>();
//Overwrite the original code when the generated substitution is generated
        boolean overwrite = true;
//retrieve my MBG configuration file
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//Build MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//line generation code
        myBatisGenerator.generate(null);
//Exceed warning message
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
