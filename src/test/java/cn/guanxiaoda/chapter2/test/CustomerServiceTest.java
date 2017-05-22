package cn.guanxiaoda.chapter2.test;

/**
 * Created by guanxiaoda on 17/5/19.
 */

import cn.guanxiaoda.chapter2.helper.DatabaseHelper;
import cn.guanxiaoda.chapter2.model.Customer;
import cn.guanxiaoda.chapter2.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 单元测试
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException {
        String file = "sql/customer_init.sql";
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String sql;
        while((sql = reader.readLine())!= null){
            DatabaseHelper.executeUpdate(sql);
        }
        reader.close();
    }

    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList("");
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void createCustomerTest() throws Exception{
        long id =1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception{
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

}
