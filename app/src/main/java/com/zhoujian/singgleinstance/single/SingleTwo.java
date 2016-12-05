package com.zhoujian.singgleinstance.single;

/**
 * Created by zhoujian on 2016/12/5.
 */


/**
 * 懒汉式
 */
public class SingleTwo
{

    //私有构造函数，防止被实例化
    private SingleTwo()
    {

    }

    private static SingleTwo mSingleTwo = null;

    public static SingleTwo getSingleInstance()
    {
        if (mSingleTwo == null)
        {
            synchronized (SingleTwo.class)
            {
                if(mSingleTwo == null)
                {
                    mSingleTwo =new SingleTwo();
                }
            }
        }

        return mSingleTwo;
    }
}
