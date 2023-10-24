// LoaderTest.java
package com.hf.sfm.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Loader}.
* It contains ten unit test cases for the {@link Loader#loadDataWithSql()} method.
*/
class LoaderTest {

    private Loader loader = new Loader();
    private Session session = HibernateSessionFactory.currentSession();
    private String sql = "";
    private String sort = "";
    private String dir = "";
    private String[] pas = null;
    private boolean paging = false;
    private int start = 0;
    private int limit = 0;
    private Query query = null;
    private List rs = null;

    @Test
    void testLoadDataWithSql() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql2() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql3() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql4() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql5() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql6() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql7() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql8() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql9() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }

    @Test
    void testLoadDataWithSql10() {
        this.loader.setSql("select * from sfm_user");
        this.loader.setSort("id");
        this.loader.setDir("desc");
        this.loader.setPaging(true);
        this.loader.setStart(0);
        this.loader.setLimit(10);
        this.loader.setPas(new String[]{"1"});
        this.loader.loadDataWithSql();
        assertEquals(1, this.loader.getRs().size());
    }
}

// HibernateSessionFactory.java
package com.hf.sfm.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
* This class is used to get the current session.
*/
public class HibernateSessionFactory {

    private static SessionFactory sessionFactory = null;

    /**
    * Get the current session.
    * @return the current session
    */
    public static Session currentSession() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (HibernateException e) {
                e.printStackTrace();
            }
        }
        return sessionFactory.openSession();
    }

    /**
    * Close the current session.
    */
    public static void closeSession() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}

// SfmUser.java
package com.hf.sfm.util;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

/**
* This class is used to get the current session.
*/
public class SfmUser {

    private String id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String sex;
    private String birthday;
    private String qq;
    private String weixin;
    private String weibo;
    private String status;
    private String remark;
    private String create_time;
    private String update_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin