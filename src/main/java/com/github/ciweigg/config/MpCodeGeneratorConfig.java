package com.github.ciweigg.config;

import com.baomidou.mybatisplus.generator.config.*;
import lombok.Data;

@Data
public class MpCodeGeneratorConfig {

    private GlobalConfig globalConfig;
    private DataSourceConfig dataSourceConfig;
    private PackageConfig packageConfig;
    private StrategyConfig strategyConfig;
    private TemplateConfig templateConfig;
    private boolean usebtl;
    private boolean usevm;
    private boolean useftl;

}
