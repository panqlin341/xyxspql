package xyxspql;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lin.entity.User;
import cn.lin.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:spring-config.xml"})//加载spring配置文件
public class ControllerTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
    private UserService userService;
	
	@Test
	public void findAllUser(){
		List<User> userList = userService.findAll();
		System.out.println(userList);
		
	}
}