package com.pdd.common.interceptor;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

/**
 * @author pdd
 * @email pengdingding@lumlord.com
 * @date 2020/12/1  9:21:12
 * @description 拦截器：给个实体对象在增加、修改时，自动添加操作属性信息
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //            佛祖保佑       永不宕机     永无BUG                  //
 * ////////////////////////////////////////////////////////////////////
 */
public class DataInfoInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        System.out.println("-----------参数拦截---------------------------------------------------");
        System.out.println("02 当前线程ID:"+Thread.currentThread().getId());
        //遍历处理所有参数，update方法有两个参数，参见Executor类中的update()方法。
        for(int i=0;i<args.length;i++)
        {
            Object arg=args[i];
            String className=arg.getClass().getName();
            System.out.println(i + " 参数类型："+className);

            //第一个参数处理。根据它判断是否给“操作属性”赋值。
            if(arg instanceof MappedStatement)
            {//如果是第一个参数 MappedStatement
                MappedStatement ms = (MappedStatement)arg;
                SqlCommandType sqlCommandType = ms.getSqlCommandType();
                System.out.println("操作类型："+sqlCommandType);
                if(sqlCommandType == SqlCommandType.INSERT || sqlCommandType==SqlCommandType.UPDATE)
                {//如果是“增加”或“更新”操作，则继续进行默认操作信息赋值。否则，则退出
                    continue;
                }
                else
                {
                    break;
                }
            }

            //第二个参数处理。（只有第二个程序才能跑到这）
            if (arg instanceof Map)
            {//如果是map，有两种情况：（1）使用@Param多参数传入，由Mybatis包装成map。（2）原始传入Map
                System.out.println("这是一个包装过的类型!");
                Map map=(Map)arg;
                for (Object obj : map.values())
                {
                    setProperty(obj);
                }
            }
            else
            {//原始参数传入
                setProperty(arg);
            }

        }

        return invocation.proceed();

    }
    /**
     * 为对象的操作属性赋值
     * @param obj
     */
    private void setProperty(Object obj)
    {
        try
        {
            //TODO: 根据需要，将相关属性赋上默认值,暂时先设置为默认值，后期改为从缓存里取值
            BeanUtils.setProperty(obj, "updateUser", "pdd");
            BeanUtils.setProperty(obj, "updateTime", new Date());
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public Object plugin(Object target) {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
