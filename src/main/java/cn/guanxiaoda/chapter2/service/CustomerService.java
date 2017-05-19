package cn.guanxiaoda.chapter2.service;

import cn.guanxiaoda.chapter2.helper.DatabaseHelper;
import cn.guanxiaoda.chapter2.model.Customer;
import cn.guanxiaoda.chapter2.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by guanxiaoda on 17/5/19.
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    public List<Customer> getCustomerList(String keyword) {
        Connection conn = DatabaseHelper.getConnection();
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);


    }

    public Customer getCustomer(long id) {
        // todo
        return null;
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {

        // todo
        return false;
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // todo
        return false;

    }

    public boolean deleteCustomer(long id) {
        // todo
        return false;
    }


}
