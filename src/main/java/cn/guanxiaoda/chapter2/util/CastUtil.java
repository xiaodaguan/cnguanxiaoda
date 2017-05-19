package cn.guanxiaoda.chapter2.util;

import com.mysql.jdbc.StringUtils;

/**
 * Created by guanxiaoda on 17/5/19.
 */
public final class CastUtil {


    public static String castString(Object obj){
        return CastUtil.castString(obj, "");

    }

    public static String castString(Object obj, String defaultValue) {
        return obj!=null?String.valueOf(obj): defaultValue;
    }

    public static double castDouble(Object obj){
        return castDouble(obj, 0);
    }

    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    doubleValue = Double.parseDouble(strValue);
                }catch(NumberFormatException e){
                    doubleValue = defaultValue;
                }

            }
        }
        return doubleValue;
    }

    public static long castLong(Object obj){
        return CastUtil.castLong(obj,0);
    }

    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    longValue =Long.parseLong(strValue);
                }catch(NumberFormatException e){
                    longValue = defaultValue;
                }
            }
        }

        return longValue;

    }


    public static int castInt(Object obj){
        return CastUtil.castInt(obj,0);
    }

    public static int castInt(Object obj, int defauleValue) {
        int intValue = defauleValue;
        if(obj!=null) {
            String strValue = CastUtil.castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defauleValue;
                }
            }
        }
        return intValue;
    }


    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj, false);
    }

    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if(obj!=null){
            booleanValue = Boolean.parseBoolean(castString(obj));

        }
        return booleanValue;
    }
}
