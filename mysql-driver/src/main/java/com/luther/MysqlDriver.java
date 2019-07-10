package com.luther;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/7/10 22:08
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class MysqlDriver implements Driver {
    @Override
    public String connection() {
        return "Mysql Driver";
    }
}
