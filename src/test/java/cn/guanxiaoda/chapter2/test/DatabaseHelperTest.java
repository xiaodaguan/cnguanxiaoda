package cn.guanxiaoda.chapter2.test;

import cn.guanxiaoda.chapter2.helper.DatabaseHelper;
import cn.guanxiaoda.chapter2.model.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guanxiaoda on 17/5/19.
 */
public class DatabaseHelperTest {


    @Test
    public void executeQueryTest() throws Exception {
        List<Map<String, Object>> result = DatabaseHelper.executeQuery("select * from customer");
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void insertEntityTest() throws Exception {
        HashMap<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("id", 3);


        fieldMap.put("name", "customer3");
        fieldMap.put("contact", "gxd");
        fieldMap.put("telephone", "13426210330");
        fieldMap.put("email", "xiaodaguan@gmail.com");
        fieldMap.put("remark", null);
        boolean result = DatabaseHelper.insertEntity(Customer.class, fieldMap);
        Assert.assertEquals(true, result);
    }
}
