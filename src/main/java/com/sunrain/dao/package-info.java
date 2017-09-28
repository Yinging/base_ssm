/**
 * 数据访问层（接口）
 * 
 * 作用：与数据打交道，可以是数据库操作，也可以是文件读写操作，甚至是redis缓存操作，总之与数据操作有关的都放在这里，
 * 也有人叫做dal或者数据持久层都差不多意思。为什么没有daoImpl，因为我们用的是mybatis，所以可以直接在配置文件中实现接口的每个方法。
 * 
 * 数据访问层包：存放数据访问接口，用于操作数据库；
 * 对应的实现：Mybatis实现查看resources/mybatis/mapper/
 * 
 * @author sunrain
 * @email dybarr@qq.com
 * @version 1.0
 */
package com.sunrain.dao;
/**
 * 业务接口定义：站在“使用者”的角度设计接口 三个方面：方法定义力度，参数，返回类型（return 类型(友好)/异常）
 *
 */