package com.one.ssm.util;

public class IdUtil {

    private static com.one.ssm.util.SnowFlake snowFlake;

    public static Long nextId(){
       if(snowFlake == null){
           snowFlake= new com.one.ssm.util.SnowFlake(1,1);
       }
       return snowFlake.nextId();
    }
}
