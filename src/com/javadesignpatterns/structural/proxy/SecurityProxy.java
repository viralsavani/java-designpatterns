package com.javadesignpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by VIRAL on 10/21/2015.
 */
public class SecurityProxy implements InvocationHandler {

    private Object obj;

    private SecurityProxy(Object obj){
        this.obj = obj;
    }

    // It builds a proxy around the class and interface it is implementing and returns new SecurityProxy object that
    // it is wrapping
    public static Object newInstance(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            result = method.invoke(obj, args);
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }catch (Exception e){
            throw new RuntimeException("Unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }
}
