package com.zhoujian.singgleinstance.single;

/**
 * Created by zhoujian on 2016/12/5.
 */

/**
 * 饿汉式
 */
public class SingleOne
{
    //私有构造函数，防止被实例化
    private SingleOne(){}
    //创建对象
    private static final SingleOne mSingleOne = new SingleOne();
    //获取对象
    public static SingleOne getInstance()
    {
        return mSingleOne;
    }
}
