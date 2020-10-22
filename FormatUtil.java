package OverloadTest;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;
import org.omg.CORBA.PUBLIC_MEMBER;
import sun.util.resources.LocaleData;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.regex.Pattern;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/22
 **/

public class FormatUtil {
    public synchronized static String format(LocaleData date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        return sdf.format(date);
    }
    public synchronized static String format(Date date ){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        return sdf.format(date);
    }
}
