package com.ymc.iotthings.core.constant;

/**
 * 系统常用变量文件
 *
 * package name: com.ymc.iotthings.core.constant
 * date :2019/5/28
 * author : ymc
 **/

public class ProjectConstant {

    // 项目基础包名称
    public static final String BASE_PACKAGE = "com.ymc.iotthings";

    // Model所在包
    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";

    // Mapper所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";

    // Service所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";

    // ServiceImpl所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";

    // Controller所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";

    // Mapper插件基础接口的完全限定名
    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.universal.Mapper";


}
